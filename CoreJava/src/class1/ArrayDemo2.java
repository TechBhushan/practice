package class1;

public class ArrayDemo2 {

	public static void main(String[] args) 
	{
		
		String ar[]= {"Sagar","Rahul","Pankaj","Nikhil"};
		
		System.out.println(ar[0]);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("***********");
		
		for(String s1:ar)   //Using new approach
		{
			System.out.println(s1);
		}

	}

}
