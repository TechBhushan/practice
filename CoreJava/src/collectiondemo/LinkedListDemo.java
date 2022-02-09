package collectiondemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		int arr[]= {50,60,70};
		System.out.println(arr[1]);
		
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(500);
		ls.add(600);
		ls.add(700);
		ls.add(800);
		
		System.out.println(ls);
		System.out.println("Is LinkedList contains 500: "+ls.contains(500));
		System.out.println(ls.size());
		ls.addFirst(1000);
		ls.addLast(5000);
		System.out.println(ls);
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		
	}

}
