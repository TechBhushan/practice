package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args)
	{
		ArrayList<Object> ar=new ArrayList<>();
		
		ar.add("Rahul");
		ar.add(30);
		ar.add('M');
		ar.add(50000.00);
		System.out.println(ar);
		System.out.println("**************************");
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("**************************");
		
		for(Object i:ar)
		{
			System.out.println(i);
		}
		System.out.println("*************************");
		
		Iterator<Object> it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
