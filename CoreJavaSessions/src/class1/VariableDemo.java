package class1;

public class VariableDemo
{
	int id=20;//instance variable
	String name="Sarang";//instance variable
	static String cname="AISSPMS"; //static variable
	
	
	
	public void show()
	{
		int marks=80;//Local variable
		System.out.println(marks);//80
		System.out.println(cname);
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		int marks=90;//local 
		System.out.println(marks);//90
		System.out.println(cname);
		VariableDemo v1=new VariableDemo();
		v1.show();
		


	}

}
