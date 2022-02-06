package class1;

public class CallByReferenceMethod
{
	
	public void display(CallByReferenceMethod obj)  //for the reference from the same class
	{
		System.out.println("call by reference");
	}
	
	public void show(Student obj)  //for the reference from Student class
	{
		System.out.println("reference from student class");
		obj.accept();
	}
	
	
	
	public void display2()
	{
		System.out.println("this is show method");
	}
	

	public static void main(String[] args) 
	{
		
		CallByReferenceMethod c1=new CallByReferenceMethod();
		c1.display(c1);
		
		Student s1=new Student();  //object for Student class
		c1.show(s1);

	}

}
