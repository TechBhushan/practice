package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args)
	{
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("Total elements in set: "+hs.size());
		System.out.println("Is set empty: "+hs.isEmpty());
		System.out.println("Is set contains 40: "+hs.contains(40));
		
		hs.remove(20);
		
		Iterator<Integer> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		hs.clear();			//clears the set
		System.out.println();

	}

}
