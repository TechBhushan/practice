package oop;



class A
{
	public void m1()
	{
		System.out.println("This is m1");
	}
}
class B extends A  //B is child and A is parent
{
	public void m2()
	{
		System.out.println("This is m2");
	}
}
class C extends B  //C is child and B is parent :   
{
	public void m3()
	{
		System.out.println("This is m3");
	}
}
class D extends A  //Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("This is m4");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		//Scenario 1: Child class reference and child class object
		C c1=new C();   //Multilevel
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println("***********");
		
		//Scenario 2: Parent class reference and parent class object
		A a1=new A();
		a1.m1();
		System.out.println("***********");
		
		//Scenario 3: Parent class reference and child class object
		A a2=new B();
		a2.m1();
		System.out.println("***********");
		
		
		

	}

}
