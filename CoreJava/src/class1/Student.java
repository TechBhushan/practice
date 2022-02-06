package class1;

public class Student {
	
	
	int id = 20;
	String name = "Rahul";
	
	public void show()
	{
		System.out.println("Student id is "+id);
		System.out.println("Student name is "+name);
	}

	public void accept()
	{
		System.out.println("this is for reference class");
	}
	
	
	public static void main(String[] args) 
	{
		Student S1 = new Student();
		S1.show();
	}

		
}
