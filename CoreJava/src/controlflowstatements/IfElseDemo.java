package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int num=sc.nextInt();
		
		if(num>=18)
		{
			System.out.println("Age is valid");
		}else
		{
			System.out.println("Age is invalid");
		}
		sc.close();

	}

}
