package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();//creates empty arraylist
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		list1.add(10); 
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
		list1.add(20);
		System.out.println(list1);
		
		//Using generics we can create Homogeneous List
		ArrayList<String> names=new ArrayList<String>();
		names.add("Amit");
		names.add("Sumit");
		names.add("Ankit");
		//names.add(10); //CTE - generics are type safety
		System.out.println(names);
		
		System.out.println(names.contains("Ankit"));
		System.out.println(list1.contains(15));
		
		list1.remove(false);
		System.out.println(list1);
		
		/*
		 * System.out.println(list1.remove(20)); //4 - index System.out.println(list1);
		 */
		
		System.out.println(list1.get(5));
		System.out.println(list1.remove(list1.lastIndexOf(20)));
		System.out.println(list1.remove(list1.indexOf(20)));
		System.out.println(list1);
			
		/*
		 * Collections.sort(list1);//RTE - ClassCastException System.out.println(list1);
		 */
		
		list1.clear();
		System.out.println(list1);
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println("Sorting in Ascending order "+names);
		
		//Lambda Expressions
		Comparator<String> comp = (n1, n2) -> n2.compareTo(n1);
		Collections.sort(names,comp);
		System.out.println("Using Lambda Expression "+names);
		
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.print(nm+"\t");
			if(nm.equals("Ankit"))
				i.remove();
		}
		
		System.out.println("------------------------------------");
		System.out.println(names);
		
	   //User Defined Type
		ArrayList<Student> studentList=new ArrayList<Student>();
	Student s1=new Student(11,"Pooja",78);
	studentList.add(s1);
	 s1=new Student(21,"Nikita",85);
	 studentList.add(s1);
	 s1=new Student(13,"Deepa",68);
	 studentList.add(s1);
	 s1=new Student(41,"Neha",72);
	 studentList.add(s1);
	 System.out.println(studentList);
		//studentList.add(10); 
	 System.out.println("--------------------");
	 Collections.sort(studentList); //CTE
	 System.out.println(studentList);
	 
	 
	 
	
	}

}
