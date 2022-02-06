package class1;

public class InstanceVsStaticVariable 
{
	
	int id1=50;  //instance variable
	
	InstanceVsStaticVariable()
	{
		System.out.println(id1);
		id1++;            //count will remain same
		
	}
	
	

	public static void main(String[] args) 
	{
		
		InstanceVsStaticVariable i1=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i2=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i3=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i4=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i5=new InstanceVsStaticVariable();

	}

}
