package oop;


//final class Demo
class Demo
{
	final int num=90;
	
	public final void display()
	{
		System.out.println("Hello Everyone!");
	}
	
}





public class FinalKeywordDemo extends Demo
{
//	public void display()
//	{
//		System.out.println("Hello All");
//	}

	public static void main(String[] args)
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		f1.display();
		
		
		
//		Demo d1=new Demo();
//		//d1.num=100;
//		System.out.println(d1.num);
//		d1.display();
	}

}
