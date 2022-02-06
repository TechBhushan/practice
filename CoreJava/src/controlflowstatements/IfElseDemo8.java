package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo8 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=sc.nextInt();
		
		if(i>=0)
		{
			System.out.println(i+" is a positive number");
		}else if(i<0)
		{
			System.out.println(i+" is a negative number");
		}
		sc.close();
		

	}

}
