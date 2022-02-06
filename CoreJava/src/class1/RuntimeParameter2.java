package class1;

import java.util.Scanner;

public class RuntimeParameter2 {
	
	public void add(int a, int b)
	{
		System.out.println("The addition is: "+(a+b));
	}
	
	public void sub(int a, int b)
	{
		System.out.println("the subtraction is: "+(a-b));
	}

	public static void main(String[] args) 
	{
		RuntimeParameter2 r3=new RuntimeParameter2();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int i3=sc.nextInt();
		int i4=sc.nextInt();
		r3.add(i3, i4);
		r3.sub(i3, i4);
		
		sc.close();

	}

}
