package controlflowstatements;

public class NestedForLoop1 {

	public static void main(String[] args) 
	{
		

		int k=1;
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
		
		
		
		
//		for(char r='a'; r<='e'; r++)
//		{
//			for(char c='a'; c<=r; c++)
//			{
//				System.out.print(r+" ");
//				r++;
//			}
//			System.out.println();
//		}
		
		
			
//		for(int r=5; r>=1; r--)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}

	}

}
