package class1;

public class StaticVsInstanceDemo 
{
	//int count=1;//instance
	static int count=1;
	StaticVsInstanceDemo ()
	{
		System.out.println(count);
		count++;
		
	}

	public static void main(String[] args)
	{
		StaticVsInstanceDemo  s1=new StaticVsInstanceDemo ();
		StaticVsInstanceDemo  s2=new StaticVsInstanceDemo ();
		StaticVsInstanceDemo  s3=new StaticVsInstanceDemo ();
		StaticVsInstanceDemo  s4=new StaticVsInstanceDemo ();
		StaticVsInstanceDemo  s5=new StaticVsInstanceDemo ();

	}

}
