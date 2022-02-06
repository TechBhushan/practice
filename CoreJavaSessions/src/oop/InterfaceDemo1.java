package oop;

interface Example
{
	public void show();
	
}




public class InterfaceDemo1 implements Example
{
	public void accept()
	{
		System.out.println("I am calling from child class");
	}

	@Override
	public void show()
	{
		System.out.println("This is implemented by child class");
	}
	public static void main(String[] args)
	{
		//Child class ref and child class object
		InterfaceDemo1 i1=new InterfaceDemo1();
		i1.accept();
		i1.show();
		
		//parent ref and child object
		Example e1=new InterfaceDemo1();
		e1.show();

	}

}
