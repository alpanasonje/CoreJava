package tns.day13.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// ordered and unsorted map
		LinkedHashMap<Integer, String> studentMap = new LinkedHashMap<Integer, String>();
		studentMap.put(1, "Saurav");
		studentMap.put(7, "Pankaj");
		studentMap.put(12, "Aditya");
		studentMap.put(4, "Ankit");
		studentMap.put(43, "Meet");
		studentMap.put(14, "Raj");
		studentMap.put(6, "Tejas");
		studentMap.put(14, "Rajeev");
		System.out.println(studentMap);		

	}

}
