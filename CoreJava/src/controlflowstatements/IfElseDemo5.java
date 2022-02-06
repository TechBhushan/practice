package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo5 {

	public static void main(String[] args)
	{

		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		
		if((i%2) == 0)
		{
			System.out.println("is even");
		}else
		{
			System.out.println("is odd");
		}
		sc.close();
	}

}
