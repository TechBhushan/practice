package class1;

public class ConstructorDemo 
{

	int id=20; //instance variables
	String name="Rahul";
	
	ConstructorDemo()
	{
		System.out.println(id);
		System.out.println(name);
	
	}
	
	ConstructorDemo(int id, String name) //Local variables
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		
		ConstructorDemo c=new ConstructorDemo();
		
		ConstructorDemo c1=new ConstructorDemo(21,"Amit");
		
		

	}

}
