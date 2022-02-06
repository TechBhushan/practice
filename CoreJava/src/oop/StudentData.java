package oop;

public class StudentData 
{
	
	private int id=100;
	private String name="Abhi";
	
	
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	


	public void refer()
	{
		System.out.println(id+" "+name);
	}
	
	

	public static void main(String[] args)
	{
		
		StudentData sd=new StudentData();
		sd.refer();
		
		

	}

}
