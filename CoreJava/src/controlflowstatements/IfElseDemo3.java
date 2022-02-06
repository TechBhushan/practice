package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char c1=sc.nextLine().charAt(0);
		
		if(c1>='a' && c1<='z' || c1>='A'  && c1<='Z')
		{
			System.out.println(c1+" is an Alphabet");
		}else
		{
			System.out.println(c1+" is not an Alphabet");
		}
		sc.close();

	}

}
