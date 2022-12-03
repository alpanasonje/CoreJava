package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class PersonDemo {
    
	public static void main(String[] args) {
		Person p1=new Person("Suresh","Pune");
		Person p2=new Person("Yogesh","Delhi");
		Person p3=new Person("Mahesh","Nagpur");
		Person p4=new Person("Rajesh","Mumbai");
		ArrayList<Person> l1=new ArrayList<Person>();
		l1.add(p1); l1.add(p2); l1.add(p3); l1.add(p4);
		System.out.println(l1);
		//Collections.sort(l1);
		Collections.sort(l1, new SortByName());
		System.out.println("--------------- Sort by Name--------------");
		System.out.println(l1);
		Collections.sort(l1, new SortByCity());
		System.out.println("--------------- Sort By City--------------");
		System.out.println(l1);
		System.out.println("\n\n---------------------------\n");
		
		Comparator<Person> comp = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(l1,comp);
		System.out.println("Using Lambda Expression "+l1);
		
		
		
		TreeSet<Person> personSet=new TreeSet<Person>(new SortByName());
		personSet.add(p1); personSet.add(p2); personSet.add(p3); 
		personSet.add(p4);
		System.out.println(personSet);
	}

}
