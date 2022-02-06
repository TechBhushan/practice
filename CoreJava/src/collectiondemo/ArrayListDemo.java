package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//Static
		int arr[]= {5,20,50,30};
		System.out.println(arr[0]);
		System.out.println("Length of Array is: "+arr.length);
		
		//Generic
		//ArrayList is a class which implements List Interface
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(50);
		al.add(60);
		al.add(100);
		al.add(200);
		al.add(500);
		
		System.out.println(al);
		System.out.println(al.get(4));		//gets the element from the ArrayList
		System.out.println("Length of Arraylist is: "+al.size());		//gets the size of the ArrayList
		System.out.println("Check if list is empty: "+al.isEmpty());		//checks if ArrayList is empty
		System.out.println("Check 200 is available: "+al.contains(200));	//checks if ArrayList contains the given element
		
		al.add(0,700);			//adds the element at given index
		System.out.println(al);
		al.remove(2);			//removes the element at given index
		System.out.println(al);
		
		
		
		//Dynamic
//		//Non-Generic Way  1.Not type safe   2.To access element type casting required
//		ArrayList al=new ArrayList();
//		al.add(50);
//		al.add("Sagar");
//		al.add(55.98);
//		al.add(80);
//		//System.out.println(al);
//		
//		int num=(int)al.get(0);
//		System.out.println(num);

	}

}
