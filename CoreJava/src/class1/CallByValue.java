package class1;

public class CallByValue {
	
	public void show(String name)
	{
		System.out.println("this is call by value");
		System.out.println("the name is "+name);
	}

	public static void main(String[] args) 
	{
		
		CallByValue c1=new CallByValue();
		c1.show("Rahul");

	}

}
