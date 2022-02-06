package controlflowstatements;

import java.util.Scanner;

public class VowelTestUsingNestedIf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char c1=sc.nextLine().charAt(0);
		//Method Chaining
		
//		String data=sc.nextLine();
//		char c1=data.charAt(0);
		
		
		
		
		if(c1=='a'||c1=='A')
		{
			System.out.println(c1+" is vowel");
		}else if(c1=='e'||c1=='E')
		{
			System.out.println(c1+" is vowel");
		}else if(c1=='i'||c1=='I')
		{
			System.out.println(c1+" is vowel");
		}else if(c1=='o'||c1=='O')
		{
			System.out.println(c1+" is vowel");
		}else if(c1=='u'||c1=='U')
		{
			System.out.println(c1+" is vowel");
		}else
		{
			System.out.println(c1+" is not vowel");
		}
		
		sc.close();
		
		
		
		
		
	}

}
