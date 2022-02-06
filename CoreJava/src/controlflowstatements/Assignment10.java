package controlflowstatements;


//import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args)
	{
		
		//Armstrong number
		int num=153,r,sum=0,temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is armstrong number");
		}else
		{
			System.out.println(temp+" is not armstrong number");
		}
		
		
		
//		//palindrome number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num=sc.nextInt(),r,sum=0,temp=num;
//		while(num>0)
//		{
//			r=num%10;
//			num=num/10;
//			sum=sum*10+r;
//		}
//		System.out.println("Reverse of "+temp+" is "+sum);
//		
//		if(temp==sum)
//		{
//			System.out.println(temp+" is a palindrome number");
//		}else
//		{
//			System.out.println(temp+" is not a palindrome number");
//		}
//		sc.close();
		
		
//		//Swapping of two numbers
//		int a=10, b=20, temp;
//		System.out.println("Before swapping a="+a+" "+"b="+b);
//		
////		a=a+b;
////		b=a-b;
////		a=a-b;
//		
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("After swapping a="+a+" "+"b="+b);
		
		
		
//		//Factorial of a number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num=sc.nextInt(),fact=1;
//		
//		for(int i=1;i<=num;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("The factorial of "+num+" is: "+fact);
//		sc.close();
		
		
//		//Addition of 100 natural numbers
//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			sum=sum+i;
//			
//		}
//		System.out.println(sum);
		
		
				

	}

}
