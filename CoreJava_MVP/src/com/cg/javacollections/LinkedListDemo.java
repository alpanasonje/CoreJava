package com.cg.javacollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Core Java");
		l1.add("Hibernate");
		l1.add("Spring boot");
		l1.add("HTML/CSS");
		l1.add("Javascript");
		l1.add("React/Angular");
		System.out.println("Linked list of Strings "+l1);
		l1.addFirst("Basics of Programming");
		l1.addLast("Test");
		System.out.println("Linked list of Strings "+l1);
		Collections.sort(l1);
		System.out.println("Linked list of Strings "+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("Linked list of Strings "+l1);
		System.out.println("First Element : "+l1.getFirst());
		System.out.println("Last Element : "+l1.getLast());
		System.out.println("-------------------------------------------");
		ListIterator li=l1.listIterator();
		/*
		 * while(li.hasNext()) { String course=li.next().toString();
		 * System.out.println(course+","+course.length()); }
		 */
		System.out.println("-------------------------------------------");
		li=l1.listIterator(l1.size());
		while(li.hasPrevious())
			System.out.println(li.previous());
	}

}
