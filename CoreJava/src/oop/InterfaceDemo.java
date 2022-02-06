package oop;

interface Demo1
{
	public void accept();
}



public class InterfaceDemo implements Demo1
{
	public void accept()
	{
		System.out.println("This is implemented method");
	}
	
	public void show()
	{
		System.out.println("This is child class method");
	}

	public static void main(String[] args)
	{
		//child class ref and child class obj
		InterfaceDemo i1=new InterfaceDemo();
		i1.accept();
		i1.show();
		
		//parent class ref and child class obj
		Demo1 d1=new InterfaceDemo();
		d1.accept();
		
		

	}

}
