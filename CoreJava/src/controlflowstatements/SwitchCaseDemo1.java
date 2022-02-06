package controlflowstatements;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		String s1=sc.nextLine();
		char c1=s1.charAt(0);
		
		switch(c1)
		{
		case 'a': System.out.println(c1+" is a vowel");
		break;
		case 'A': System.out.println(c1+" is a vowel");
		break;
		case 'e': System.out.println(c1+" is a vowel");
		break;
		case 'E': System.out.println(c1+" is a vowel");
		break;
		case 'i': System.out.println(c1+" is a vowel");
		break;
		case 'I': System.out.println(c1+" is a vowel");
		break;
		case 'o': System.out.println(c1+" is a vowel");
		break;
		case 'O': System.out.println(c1+" is a vowel");
		break;
		case 'u': System.out.println(c1+" is a vowel");
		break;
		case 'U': System.out.println(c1+" is a vowel");
		break;
		default: System.out.println(c1+" is not a vowel");
		}
		sc.close();
		

	}

}
