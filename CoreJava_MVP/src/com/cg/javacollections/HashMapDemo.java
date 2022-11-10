package com.cg.javacollections;

//HashMap - Unordered, Unsorted Collection
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1011, "Aniket");
		hm.put(1019, "Pooja");
		hm.put(1081, "Neha");
		hm.put(1031, "Nikhil");
		hm.put(1061, "Vishal");
		System.out.println("Employee Details "+hm);
		
		System.out.println(hm.get(1031));
		
		hm.put(1000, "Pooja"); //allows duplicate values
		System.out.println("Employee Details "+hm);
		
		hm.put(1000, "Pratiksha"); //replaces current value when key repeats
		System.out.println("Employee Details "+hm);

	}

}
