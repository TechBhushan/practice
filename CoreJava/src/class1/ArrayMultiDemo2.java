package class1;

public class ArrayMultiDemo2 {

	public static void main(String[] args)
	{
		
		Object ar[][]= {{"Rahul",20},{"Nagesh",30}};
		
		for(Object x[]:ar)
		{
			for(Object y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
