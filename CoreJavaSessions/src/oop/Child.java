package oop;

public class Child extends Parent
{
	String name="Jay";
	public void childIncome()
	{
		System.out.println("Child Income: $15000");
	}
	
	public void data()
	{
		System.out.println("Child name is: "+name);
		//super keyword to call immediate parent variable
		System.out.println("Parent name is: "+super.name);
		//super keyword to call immediate parent method
		super.parentIncome();
	}
	

	public Child()
	{
		super();
	}
	public void color()
	{
		String s="Red";
		System.out.println("Child color is: "+s);
	}
	public static void main(String[] args) 
	{

		//Child class ref & child  class Object
		Child c1=new Child();
		c1.data();
//		c1.parentIncome();
//		c1.childIncome();
		//c1.color();//Red
		/*
		//Parent ref and Parent object
		Parent p1=new Parent();
//		p1.parentIncome();
		p1.color();//yellow
				
				
		//Parent class ref and Child class Object
		Parent p2=new Child();
		//p2.parentIncome();
		p2.color();//Red
*/
	}

}
