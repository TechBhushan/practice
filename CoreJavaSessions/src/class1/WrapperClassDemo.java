package class1;

public class WrapperClassDemo {

	public static void main(String[] args)
	{

		//Object to Primitive
		String s1="100";
		System.out.println(s1+100);//100100
		int num1=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num1+100);//200
		
		
		String s2="45.55";
		System.out.println("String data is: "+s2);
		double d1=Double.parseDouble(s2);
		System.out.println("Double data "+(d1+10.10));
		
		String s3="true";
		boolean b1=Boolean.parseBoolean(s3);
		System.out.println("Boolean data: "+b1);
		
		String s4="S";
		
		char data=s4.charAt(0);
		
		System.out.println("Character data is: "+data);
		
		
		
		
		
		//Primitive to Object conversion
		int num2=900;
		System.out.println(num2+100);//1000
		String ss1=String.valueOf(num2);
		System.out.println(ss1+100);//900100
		
		char c1='R';
		String ss2=String.valueOf(c1);
		System.out.println(ss2);
		
		
		
		
		
		
		
		

	}

}
