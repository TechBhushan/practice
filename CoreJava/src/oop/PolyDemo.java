package oop;

public class PolyDemo
{
	
	//1.Number of arguments
	public void add()
	{
		int a=100, b=100;
		System.out.println(a+b);
	}
	
	public void add(int a)
	{
		System.out.println(a);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	//2.Type of arguments
	public void add(int a, double b)
	{
		System.out.println(a+b);
	}
	//3.Sequence of arguments
	public void add(double a, int b)
	{
		
	}
	
	//Constructor Overloading
	public PolyDemo()
	{
		System.out.println("This is default constructor");
	}
	public PolyDemo(int a)
	{
		System.out.println("This is parameterized");
	}
	public PolyDemo(double a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		
		PolyDemo pl=new PolyDemo();   //default constructor
		pl.add();
		pl.add(100);
		pl.add(100, 100);
		pl.add(10,20);
		
		PolyDemo pl1=new PolyDemo(50);  //parameterized constructor
		pl1.add();
		
		
		
		

	}

}
