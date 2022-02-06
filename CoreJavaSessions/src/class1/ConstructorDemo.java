package class1;

public class ConstructorDemo
{

		int id=20;//instance
		String name="Sarang";//instance
		
		ConstructorDemo()
		{
			System.out.println(id);
			System.out.println(name);
		}
		ConstructorDemo(int i,String n)//Local i=21,n=Amit
		{
			System.out.println(i+" "+n);
		}
		
		
	public static void main(String[] args)
	{

		ConstructorDemo c1=new ConstructorDemo();//default
		
		ConstructorDemo c2=new ConstructorDemo(21,"Amit");
		
		
		
		
		
		
		

	}

}
