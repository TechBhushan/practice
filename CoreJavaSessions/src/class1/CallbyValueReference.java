package class1;

public class CallbyValueReference
{
	public void display(FirstCode obj)//obj=c1
	{
		System.out.println("This is Call by reference");
		//obj.show("Jay");
		obj.accept();
	}

	public void show(String name)//name=Sarang
	{
		System.out.println("This is call by value");
		System.out.println("Name of Student is: "+name);
	}
	
	public static void main(String[] args)
	{

		CallbyValueReference c1=new CallbyValueReference();
		c1.show("Sarang");//call by value
		
		FirstCode f1=new FirstCode();
		c1.display(f1);
		//reference-->Object
		//c1.display(c1);//call by reference

	}

}
