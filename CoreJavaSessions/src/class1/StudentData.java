package class1;

public class StudentData
{
	//data
	int id=18;
	String name="Ajay";
	
	//Method
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		//To call class members we need Object to create
		
		StudentData s1=new StudentData();
		s1.display();
		System.out.println(s1.id);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
