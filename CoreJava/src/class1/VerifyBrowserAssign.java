package class1;

import java.util.Scanner;

public class VerifyBrowserAssign {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name: ");
		String s1=sc.nextLine();
		
		
		if(s1.equalsIgnoreCase("Chrome"))
		{
			System.out.println("User is on "+s1);
		}else if(s1.equalsIgnoreCase("Opera"))
		{
			System.out.println("User is on "+s1);
		}else if(s1.equalsIgnoreCase("IE"))
		{
			System.out.println("User is on "+s1);
		}else if(s1.equalsIgnoreCase("Firefox"))
		{
			System.out.println("User is on "+s1);
		}else
		{
			System.out.println("Enter correct browser name");
		}
		
		
//		String ar[]= {"Firefox","Chrome","Opera","IE"};
//		
//		for(String i:ar)
//		{
//			if(i.equalsIgnoreCase(s1))
//			{
//				System.out.println("User is on "+i);
//				break;
//			}
//		}
		
		sc.close();

	}

}
