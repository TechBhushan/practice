package oop;

public class PolyDemo1 
{
	
	public void add()
	{
		int a=100,b=200;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.number of Arguments
	public void add(int a)
	{
		System.out.println(a);
	}
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//2.types of Arguments 
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	 //3.change Order of Arguments
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//Constructor Overloading
	public PolyDemo1()
	{
		System.out.println("This is default calling");
	}
	
	public PolyDemo1(String data)
	{
		System.out.println(data);
	}
	
	public PolyDemo1(int data)
	{
		System.out.println(data);
	}
	

	public static void main(String[] args)
	{
		PolyDemo1 p1=new PolyDemo1();//default
		p1.add();
		p1.add(100);
		p1.add(100.20, 100);
		p1.add(200,100.0);
		p1.add(20,90);
		p1.add(10,10,10);
		PolyDemo1 p2=new PolyDemo1("Project1");
	}

}
