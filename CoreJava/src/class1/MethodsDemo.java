package class1;

public class MethodsDemo {
	
	public static void show()
	{
		System.out.println("this is static method");
	}
	
	public void insta()
	{
		System.out.println("this is instance method");
	}
	
	

	public static void main(String[] args) 
	{
		
		
		MethodsDemo m=new MethodsDemo();  //object to call instance method
		m.insta();
		
		MethodsDemo.show();  //to call static method directly from class

	}

}
