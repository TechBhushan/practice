package class1;

public class InstanceVsStaticVariable1 {

	static int id=50;  //static variable
	
	InstanceVsStaticVariable1()  
	{
		System.out.println(id);
		id++;             //count will increase
	}
	
	
	public static void main(String[] args) 
	{
		
		InstanceVsStaticVariable1 i1=new InstanceVsStaticVariable1();
		InstanceVsStaticVariable1 i2=new InstanceVsStaticVariable1();
		InstanceVsStaticVariable1 i3=new InstanceVsStaticVariable1();
		InstanceVsStaticVariable1 i4=new InstanceVsStaticVariable1();
		InstanceVsStaticVariable1 i5=new InstanceVsStaticVariable1();

	}

}
