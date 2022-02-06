package oop;


class A
{
	public void m1()
	{
		System.out.println("This is M1");
	}
}

class B extends A//B is child and A is Parent---Single Level
{
	public void m2()
	{
		System.out.println("This is M2");
	}
}

class C extends B//c is child and B is Parent----Multilevel 
{
	public void m3()
	{
		System.out.println("This is M3");
	}
}

class D extends A//D is child and A is Parent--->Hierachical 
{
	public void m4()
	{
		System.out.println("This is M4");
	}
}


public class InheritanceDemo {

	public static void main(String[] args)
	{
		//Scenario 1: Child class ref and child class object
//		B b1=new B();
//		b1.m1();
//		b1.m2();
		//Multilevel
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		
		
		//Scenario 2:Parent class ref and Parent class Object
//		A a1=new A();
//		a1.m1();
		
		B b1=new B();
		b1.m1();
		b1.m2();
		
		
		//Scenario 3: Parent class ref and child class object
//		A a2=new B();
//		a2.m1();
		
		
		B b2=new C();
		b2.m1();
		b2.m2();
		
		//Scanario 4: Child class ref and Parent class Object
		//Invalid scenario
		
		//B b2=new A();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
