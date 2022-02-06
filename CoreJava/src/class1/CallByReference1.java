package class1;

public class CallByReference1 {
	
	public void display(Student obj)
	{
		System.out.println("practice");
		obj.accept();
	}
	
	public void show(String name)
	{
		System.out.println("this is reference");
		System.out.println("the name is "+name);
		
	}
	
	public static void main(String[] args) 
	{
		
		CallByReference1 c1=new CallByReference1();
		//c1.show("Rahul");
		
		Student s1=new Student();
		c1.display(s1);
		
		
	}

}
