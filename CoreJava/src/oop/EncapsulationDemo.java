package oop;

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		
		StudentData s1=new StudentData();
		
		System.out.println(s1.getId());
		
		System.out.println(s1.getName());
		
		s1.setId(500);
		s1.setName("Rahul");
		
		System.out.println(s1.getId());
		
		System.out.println(s1.getName());

	}

}
