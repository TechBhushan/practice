package class1;

public class MethodsDemo 
{
	public void accept()
	{
		System.out.println("This is Instance Method");
	}
	
	public static void show()
	{
		System.out.println("This is Static Method");
	}
	

	public static void main(String[] args)
	{

		MethodsDemo.show();
		
		MethodsDemo m1=new MethodsDemo();
		m1.accept();
		//m1.show();
		
		
		
		
		

	}

}
