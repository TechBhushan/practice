package class1;

public class MethodsParameter {
	
	public void add()  //method without parameter
	{
		int a=20, b=30;
		System.out.println("addition is "+(a+b));
	}
	
	public void sub(int a, int b)  //method with parameter
	{
		System.out.println("substraction is "+(a-b));
	}
	
	public int mul()  //method with return type
	{
		int a=10, b=20;
		return a*b;
	}

	public static void main(String[] args) 
	{
		MethodsParameter p1=new MethodsParameter();
		
		p1.add();
		
		p1.sub(100, 50);
		
		System.out.println(p1.mul());
		
//		int ret=p1.mul();    //calling by variable
//		System.out.println(ret);

	}

}
