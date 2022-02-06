package controlflowstatements;

import java.util.Scanner;

public class NestedIfLoop {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num==0)
		{
			System.out.println("Zero");
		}else if(num==1)
		{
			System.out.println("One");
		}else if(num==2)
		{
			System.out.println("Two");
		}else if(num==3)
		{
			System.out.println("Three");
		}else if(num==4)
		{
			System.out.println("Four");
		}else if(num==5)
		{
			System.out.println("Five");
		}else
		{
			System.out.println("Number is invalid");
		}
		sc.close();

	}

}
