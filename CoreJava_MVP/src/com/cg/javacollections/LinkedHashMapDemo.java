package com.cg.javacollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		  LinkedHashMap<Integer, Emp> lhm = new LinkedHashMap<Integer, Emp>();
		  lhm.put(10, new Emp(2001, "Pankaj", 70000)); 
		  lhm.put(15, new Emp(2009, "Dhruv",65000)); 
		  lhm.put(12, new Emp(2003, "Sneha", 91000)); 
		  lhm.put(13, new Emp(2008,"Ankita", 83000)); 
		  lhm.put(11, new Emp(2006, "Neeraj", 77000));
		  System.out.println(lhm);
		  System.out.println("-----------------------------------");
		  System.out.println(lhm.get(15));
		  System.out.println("-----------------------------------");
		  lhm.remove(11);
		  System.out.println(lhm);
		  System.out.println("-----------------------------------");
		  Set<Integer> s=lhm.keySet();
		  Iterator<Integer> i=s.iterator();
		  while(i.hasNext())
		  {
			  Integer key=i.next();
			  System.out.println(key +" : "+lhm.get(key));			  
		  }
		  
	}

}
