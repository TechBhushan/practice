package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo6 {

	public static void main(String[] args)
	{
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==10 || num==50 || num==100)
		{
			System.out.println(num+" is a given number");
		}else
		{
			System.out.println(num+" is not a given number");
		}
		
//		switch(num)
//		{
//		case 10: System.out.println(num+" is a given number");
//		break;
//		case 50: System.out.println(num+" is a given number");
//		break;
//		case 100: System.out.println(num+" is a given number");
//		break;
//		
//		default: System.out.println(num+" is not a given number");
//		}
		sc.close();
		
		

	}

}
