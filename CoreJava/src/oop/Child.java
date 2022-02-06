package oop;

public class Child extends Parent
{
	
	public void childIncome()
	{
		System.out.println("Child income is: 25000");
	}
	
	public void color()
	{
		System.out.println("Red");
	}

	public static void main(String[] args) 
	{
		//Child class ref and child class object
		Child c1=new Child();   		
		c1.parentIncome();
		c1.childIncome();
		
		c1.color();  			//Red
		
		//Parent class ref and child class object
		Parent p1=new Child();   		
		p1.parentIncome();
		
		p1.color();  			//Red
		
		//Parent class ref and parent class object
		Parent p2=new Parent();			
		p2.color(); 			//Yellow
		
		
		

	}

}
