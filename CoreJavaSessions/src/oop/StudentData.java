package oop;

public class StudentData 
{
	private int sid=20;
	private String name="Sarang";
	
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
			
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void display()
	{
		System.out.println(sid+" "+name);
	}
	
	public static void main(String[] args)
	{
		StudentData s1=new StudentData();
		s1.display();//20 Sarang
		
		s1.sid=21;
		s1.name="Vidya";
		
		s1.display();//21 Vidya


	}

}
