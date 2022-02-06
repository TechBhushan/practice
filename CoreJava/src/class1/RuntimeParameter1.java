package class1;

import java.util.Scanner;

public class RuntimeParameter1 {
	
	public void Name(String name)
	{
		System.out.println("Your name is: "+name);
	}

	public static void main(String[] args) 
	{
		
		RuntimeParameter1 r2=new RuntimeParameter1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s1=sc.nextLine();
		r2.Name(s1);
		
		//System.out.println("Your name is: "+s1);
		
		sc.close();

	}

}
