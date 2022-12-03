package com.tns.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
public static void main(String args[])
{
	Hashtable ht=new Hashtable();
	ht.put("Nitin","nitin123@gmail.com");
	ht.put("Deepak","deepak123@gmail.com");
	//ht.put(null,"abc");
	ht.put("Harish","harish123@gmail.com");
	ht.put("Ravi","ravi123@gmail.com");
	System.out.println(ht);
	Enumeration em=ht.keys();
	while(em.hasMoreElements())
	{
		String nm=em.nextElement().toString();
		System.out.println(nm+" : "+ht.get(nm));
	}
	
	
}
}
