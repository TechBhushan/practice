package class1;

public class ParameterCompileTime 
{
	
	public void add()//declare
	{
		int a=10,b=20;//local
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)//a=100,b=50 local
	{
		System.out.println("Subtraction is: "+(a-b));
		
	}
	//To return value from method we use return keyword
	public int mul(int a,int b)//a=10,b=10
	{
		return a*b;//it will return output to calling method
	}
	
	
	

	public static void main(String[] args) 
	{
		
		ParameterCompileTime p1=new ParameterCompileTime ();
		//Compile time calling method
		p1.add();//calling
		p1.sub(100,50);//calling with parameter
		System.out.println(p1.mul(10,10));
//		int res=p1.mul(10,10);//with return keyword
//		System.out.println("Multiplication result is: "+res);

	}

}
