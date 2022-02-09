package collectiondemo;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try{
			System.out.println("Division is: "+(a/b));
		}catch(ArithmeticException e)
		{
			System.out.println("Please Enter number other than 0 "+e.getMessage());
		}
		System.out.println("Multiplication is: "+(a*b));
		
		sc.close();
	}

}
