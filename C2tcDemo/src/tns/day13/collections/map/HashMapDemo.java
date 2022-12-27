package tns.day13.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//unordered and unsorted map
		HashMap<Integer, String>  studentMap=new HashMap<Integer, String>();
		studentMap.put(1,"Saurav");
		studentMap.put(7,"Pankaj");
		studentMap.put(12,"Aditya");
		studentMap.put(4,"Ankit");
		studentMap.put(43,"Meet");
		studentMap.put(14,"Raj");
		studentMap.put(6,"Tejas");
		studentMap.put(14,"Rajeev");
		System.out.println(studentMap);
		
		studentMap.put(10,null);
		System.out.println(studentMap);
		
		studentMap.put(null,null);
		System.out.println(studentMap);
		
		System.out.println(studentMap.containsKey(43));
		System.out.println(studentMap.containsValue("Raj"));
		Set s=studentMap.entrySet();
		System.out.println(s);
		
		if(studentMap.get(4)==null)
			System.out.println("Rollno doesnot exists");
		else
			System.out.println("Name : "+studentMap.get(4));
		
		System.out.println("Student Count : "+studentMap.size());
		studentMap.replace(4, "Ankita");
		System.out.println(studentMap);
		Set s1=studentMap.keySet();
		Iterator it=s1.iterator();
		Integer key;
		while(it.hasNext()){
			key=Integer.parseInt(it.next().toString());
			System.out.println(key +" : "+studentMap.get(key));
		}
	}
}
