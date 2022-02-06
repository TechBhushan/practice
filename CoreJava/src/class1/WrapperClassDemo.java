package class1;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		
		String s1="100";
		System.out.println("String data is "+(s1+100));
		int i1=Integer.parseInt(s1);
		System.out.println("Its integer is "+(i1+100));
		
		System.out.println("****************************************************");
		
		String s2="42.50";
		System.out.println("String data is "+(s2+10));
		double d1=Double.parseDouble(s2);
		System.out.println("Its double is "+(d1+10));
		
		System.out.println("****************************************************");
		
		String s3="true";
		System.out.println("String data is "+s3);
		boolean b1=Boolean.parseBoolean(s3);
		System.out.println("Its boolean is "+b1);
		
		System.out.println("****************************************************");
		
		int i=18;
		System.out.println("integer data is "+(i+10));
		String s=String.valueOf(i);
		System.out.println("string is "+(s+10));
		
		System.out.println("****************************************************");
		
		double d=55.55;
		System.out.println("double data is "+(d+10));
		String s4=String.valueOf(d);
		System.out.println("string is "+(s4+10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
