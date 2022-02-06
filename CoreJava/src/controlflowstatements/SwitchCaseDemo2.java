package controlflowstatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char c1=sc.nextLine().charAt(0);
		
		switch(c1)
		{
		case 'a','A': System.out.println(c1+" is a vowel");
		break;
		case 'e','E': System.out.println(c1+" is a vowel");
		break;
		case 'i','I': System.out.println(c1+" is a vowel");
		break;
		case 'o','O': System.out.println(c1+" is a vowel");
		break;
		case 'u','U': System.out.println(c1+" is a vowel");
		break;
		default: System.out.println(c1+" is not a vowel");
		}
		sc.close();
		

	}

}
