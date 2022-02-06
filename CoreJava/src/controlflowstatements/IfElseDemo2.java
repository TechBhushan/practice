package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char s1=sc.nextLine().charAt(0);
		
		if(s1=='a'||s1=='A')
		{
			System.out.println(s1+" is a vowel");
		}else if(s1=='a'||s1=='A')
		{
			System.out.println(s1+" is a vowel");
		}else if(s1=='e'||s1=='E')
		{
			System.out.println(s1+" is a vowel");
		}else if(s1=='i'||s1=='I')
		{
			System.out.println(s1+" is a vowel");
		}else if(s1=='o'||s1=='O')
		{
			System.out.println(s1+" is a vowel");
		}else if(s1=='u'||s1=='U')
		{
			System.out.println(s1+" is a vowel");
		}else
		{
			System.out.println(s1+" is not a vowel");
		}
		sc.close();

	}

}
