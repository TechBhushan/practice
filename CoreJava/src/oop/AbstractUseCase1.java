package oop;

public class AbstractUseCase1 extends AbstractClassDemo
{
	
	public void show()
	{
		System.out.println("Its show method in child class.");
	}

	public static void main(String[] args)
	{
		//Scenario 1: Child class ref and child class object
		AbstractUseCase1 a1=new AbstractUseCase1();
		a1.accept();
		a1.display();
		a1.show();
		
		//Scenario 2: Parent class ref and child class object
		AbstractClassDemo a2=new AbstractUseCase1();
		a2.accept();
		a2.display();
		
		//Scenario 3: Parent class ref and parent class object
		//AbstractClassDemo a3=new AbstractClassDemo();			//we cannot create abstract parent class object

	}

	@Override
	public void display()
	{
		System.out.println("Its overriden method.");
		
	}

}
