package oop;


class Demo   //final : cannot extend the class
{
	final int i=90;			//value will be fixed
	
	public final void display()		//cannot override the method
	{
		System.out.println("Hello!");
	}
}



public class FinalKeywordDemo extends Demo
{
//	public void display()
//	{
//		System.out.println("Hi");
//	}
	
	

	public static void main(String[] args) 
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		//f1.i=100;
//		f1.display();
		System.out.println(f1.i);
		

	}

}
