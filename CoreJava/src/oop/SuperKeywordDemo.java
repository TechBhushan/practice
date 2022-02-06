package oop;

public class SuperKeywordDemo extends Parent1
{
	
	String name="Jay";
	
	public void data()
	{
		System.out.println("The child name is: "+name);
		//super keyword to call immediate parent variable
		System.out.println("The parent name is: "+super.name);
		//super keyword to call immediate parent method
		super.parentIncome();
	}
	
	public SuperKeywordDemo()
	{
		super();				//Will call parent1 constructor
	}
	
	public static void main(String[] args)
	{
		
		SuperKeywordDemo c1=new SuperKeywordDemo();			//Will call parent1 constructor
		
		c1.data();  			//used super keyword to call variable

	}

}
