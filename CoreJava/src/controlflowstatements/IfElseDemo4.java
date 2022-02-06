package controlflowstatements;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args)
	{
		
		
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		
		if(i>i1 && i>i2)
		{
		   System.out.println(i+" is largest");
		}else if(i1>i && i1>i2)
		{
			System.out.println(i1+" is largest");
		}else if(i2>i && i2>i1)
		{
			System.out.println(i2+" is largest");
		}else
		{
			System.out.println("Some largest values are equal");
		}
		sc.close();
		

	}

}
