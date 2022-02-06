package class1;

public class MethodsParameter1 
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) 
	{
		MethodsParameter1 m1=new MethodsParameter1();
		System.out.println(m1.add(10, 10));
		m1.sub(100, 50);
		System.out.println(m1.mul(10, 20));
		System.out.println(m1.div(100, 20));

	}

}
