package com.cg.javacollections;

//HashMap - Unordered, Unsorted Collection
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		hm.put(null, null);
		System.out.println("Employee Details "+hm);
		
		hm.put(101, null);
		System.out.println("Employee Details "+hm);
		
		hm.put(102, null);
		System.out.println("Employee Details "+hm);
		
		hm.put(null, "ABC");
		System.out.println("Employee Details "+hm);
		
		Set set = hm.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while(i.hasNext()) { // Display elements
		Map.Entry me = (Map.Entry)i.next();
		System.out.println(me.getKey() + ": "+ me.getValue());
		}
	}

}
