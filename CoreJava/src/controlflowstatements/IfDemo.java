package controlflowstatements;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int num=sc.nextInt();
		
		
		if(num>=18)
		{
			System.out.println("Age is valid");
		}
		sc.close();

	}

}
