package oop;

public class AbstractImplementation extends AbstarctClassDemo
{

	public void show()
	{
		System.out.println("This is show method");
	}
	public static void main(String[] args)
	{
		//Scenario 1:child class ref and child class object
		AbstractImplementation a1=new AbstractImplementation();
		a1.accept();
		a1.display();
		a1.show();
		//Scenario 2:Parent class ref and child class object
		
		AbstarctClassDemo a2=new AbstractImplementation();
		a2.accept();
		a2.display();

		//Scenario 3: parent class ref and parent class object
		//invalid scenario
		//AbstarctClassDemo a3=new AbstarctClassDemo();
		
		//Scenario 4: child class ref and Object class Parent
		//AbstractImplementation a4=new AbstarctClassDemo();
		
	}
	@Override
	public void display() {
		System.out.println("Its implemented now!");
		
	}

}
