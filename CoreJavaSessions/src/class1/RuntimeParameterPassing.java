package class1;



import java.io.IOException;
import java.util.Scanner;


public class RuntimeParameterPassing
{
	
	public void show(String n)//name=name/jay
	{
		System.out.println("Student name is calling from method: "+n);
	}

	public static void main(String[] args) throws IOException
	{
		
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		//Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		r1.show(name);//Calling method
		//passing data through this method
		
		
//		System.out.println("Enter your age: ");
//		int age=sc.nextInt();
//		System.out.println(age);
		
		sc.close();
		
		
		
		
		
		//BufferedReader class
		
		//InputStreamReader ir=new InputStreamReader(System.in);
		
		//BufferedReader br=new BufferedReader(ir);
//		
		
		
		
		
		
		//Method 1: System.in.read()
//		System.out.println("Enter your age");
//		int age=System.in.read();
//		//read() will accept single character 
//		System.out.println("Your age is: "+(char)age);
	}

}
