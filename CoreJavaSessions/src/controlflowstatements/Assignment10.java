package controlflowstatements;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args)
	{ 
		//Palindrome number
		int num=121,r,sum=0,temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}
		
		System.out.println("Reverse of "+temp+" is: "+sum);
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}else
		{
			System.out.println(temp+" is not a palindrome number");
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		//Swapping between two number
		int a=10,b=20,temp;
		System.out.println("Before swapping a="+a+" "+"b="+b);
//		temp=a;
//		a=b;
//		b=temp;
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		System.out.println("After swapping a="+a+" "+"b="+b);
		
		
		
		
		
		
		
		
		
		
	
		//Print factorial of number
		
		//5!=1*2*3*4*5=120
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt(),fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+" is: "+fact);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	
		//sum of 100 natural number=5050
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
			
		}
			System.out.println(sum);
		*/
		
		
		
		
		

//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}

	}

}
