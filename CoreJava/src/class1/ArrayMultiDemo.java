package class1;

public class ArrayMultiDemo {

	public static void main(String[] args)
	{
		
		//Old Approach
		int ar[][]=new int[2][3];
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=50;
		ar[1][0]=30;
		ar[1][1]=40;
		
		System.out.println(ar[0][2]);
		System.out.println(ar.length);      //length of row
		System.out.println(ar[0].length);   //length of column
		
		//New Approach
		int ar1[][]= {{20,30,40},{50,60,70}};
		
		System.out.println(ar1[1][2]);
		
		
		
	}

}
