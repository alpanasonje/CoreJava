package com.cg.javacollections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("MH15", "Nashik");
		tm.put("MH12", "Pune");
		tm.put("MH01", "Mumbai");
		tm.put("MH14", "Baramati");
		tm.put("GJ1", "Ahmedabad");
		//tm.put(12, "ABC");
		tm.put(null, null); //throws NullPointerException
		System.out.println(tm);
		
		

	}

}
