package com.tns.collections;
import java.util.*;
class HashMapDemo 
{
	public static void main(String args[]) 
	{
		HashMap<String,Double> hm = new HashMap<String,Double>();
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Jane Baker", new Double(19.08));
		System.out.println(hm);
		
		Set set = hm.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while(i.hasNext()) { // Display elements
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": "+ me.getValue());
		}
		
		HashMap<String, String> hm1=new HashMap<String,String>();
		hm1.put("Nitin","nitin123@gmail.com");
		hm1.put("Deepak",null);
		hm1.put(null,"abc");
		hm1.put("Harish",null);
		hm1.put(null,null);
		hm1.put("Ravi","ravi123@gmail.com");
		System.out.println(hm1);
		
		HashMap<Integer,Student> hm2=new HashMap<Integer,Student>();
		hm2.put(10001,new Student(1,"Aniket",78));
		hm2.put(10005,new Student(2,"Sumit",84));
		hm2.put(10006,new Student(3,"Amit",81));
		hm2.put(10003,new Student(5,"Ankit",72));
		hm2.put(10004,new Student(4,"Anil",78));
		System.out.println(hm2);
	}
}