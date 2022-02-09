package collectiondemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101, "Sagar");
		hm.put(102, "Naresh");
		hm.put(103, "Rahul");
		hm.put(104, "Narang");
		hm.put(105, "Atul");
		hm.put(106, "Akshat");
		
		System.out.println(hm);
		System.out.println(hm.get(104));
		
		hm.put(104, "Akshay");
		System.out.println(hm);
		
		System.out.println(hm.size());
	}

}
