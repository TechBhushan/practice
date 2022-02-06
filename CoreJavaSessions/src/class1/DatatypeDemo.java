package class1;

public class DatatypeDemo {

	public static void main(String[] args) 
	{
		//boolean   true /false[1/0]   1 bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		status=false;
		System.out.println("Updated value: "+status);//false
		
		System.out.println("**************************************");
		//character 2byte used to store single character
		char c1='A';
		System.out.println("Character data is: "+c1);
		char c2='$';
		System.out.println("Character data is: "+c2);
		char c3=97;// accepting Ascii value and storing its character
		System.out.println("character data is: "+c3);//a
		char c4=65;
		System.out.println("Character data is: "+c4);
		System.out.println("*********************************************");
		//Byte   1byte   -128 to 127
		byte b1=127;
		System.out.println("Byte data is: "+b1);
		System.out.println("*********************************************");
		//short  2byte 32768
		
		short s1=32000;
		System.out.println("Short data: "+s1);
		System.out.println("*********************************************");
		
		//int 4byte 
		int i1=50000;
		System.out.println("Integer data is: "+i1);
		
		System.out.println("*********************************************");
		//Long 8byte
		
		
		long l1=9999999999L;
		System.out.println("Long data is: "+l1);
		System.out.println("*********************************************");
		
		//floating point 1.float 2.double(by default)
		//double 8byte (16decimal digit)
		double d1=89.78;
		System.out.println("Double data is: "+d1);
		System.out.println("*********************************************");
		//float  4byte   (8decimal digit)
		float f1=56.67F;
		System.out.println("Float data is: "+f1);
		System.out.println("*********************************************");
		//Type Casting
		//Implicit (Automatic)
		int a=100;
		long l2=a;
		System.out.println("Integer to long conversion: "+l2);
		
		char cc1='A';
		int num1=cc1;//Ascii of A
		System.out.println("Character to Integer data is: "+num1);
		
		float f2=num1;//65
		System.out.println("Integer to float data is: "+f2);
		
		//Explicit(Manually)---Casting operator
		double d2=49.89;
		int b=(int)d2;
		System.out.println("Double to integer conversion: "+b);
		
		char cc2=(char) num1;
		System.out.println("Integer to character data is: "+cc2);
		
		int num2=(int)f1;//56.67
		System.out.println("Float to integer data is: "+num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
