package collectiondemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(50);
		ts.add(60);
		ts.add(30);
		ts.add(70);
		ts.add(90);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(50));
		System.out.println(ts.isEmpty());
		
		System.out.println(ts.descendingSet());		//set in descending order
		System.out.println(ts.headSet(70));			//less than given value
		System.out.println(ts.tailSet(30));			//greater than given value
		System.out.println(ts.subSet(30, 70));		//between the values
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		
		
		
		
		
		
	}

}
