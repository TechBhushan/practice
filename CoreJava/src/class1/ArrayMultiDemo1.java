package class1;

public class ArrayMultiDemo1 {

	public static void main(String[] args)
	{
		
		int arr[][]= {{10,20,30},{50,60,70},{80,90,100}};
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[0].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("************************************");
		
		for(int x[]:arr)    //it will accept data row wise
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
