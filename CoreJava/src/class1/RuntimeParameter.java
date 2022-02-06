package class1;

import java.util.Scanner;

public class RuntimeParameter {
	
	public void add(int a)
	{
		System.out.println("Your number is "+a);
	}

	public static void main(String[] args) 
	{
		
		RuntimeParameter r1=new RuntimeParameter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int i1=sc.nextInt();
		r1.add(i1);

		
		
		sc.close();

	}

}
