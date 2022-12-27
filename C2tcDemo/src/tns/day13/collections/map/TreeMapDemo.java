package tns.day13.collections.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//Sorted map on key
		TreeMap<Integer, String>  studentMap=new TreeMap<Integer, String>();
		studentMap.put(1,"Saurav");
		studentMap.put(7,"Pankaj");
		studentMap.put(12,"Aditya");
		studentMap.put(4,"Ankit");
		studentMap.put(43,"Meet");
		studentMap.put(14,"Raj");
		studentMap.put(6,"Tejas");
		studentMap.put(14,"Rajeev");
		System.out.println(studentMap);
		
		studentMap.put(10, null);
		System.out.println(studentMap);
		
		//RTE null keys not allowed
		studentMap.put(null, null);
		System.out.println(studentMap);
		
		
	}

}
