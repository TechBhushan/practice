package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
		
		ArrayList<String> st=new ArrayList<>();
		st.add("Rahul");
		st.add("Neha");
		st.add("Amit");
		st.add("Suresh");
		
		for(int i=0; i<st.size(); i++)
		{
			System.out.println(st.get(i));
		}
		System.out.println("*********************************");
		
		for(String i:st)
		{
			System.out.println(i);
		}
		//Iterator class ----> iterator()
		Iterator<String> it=st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
