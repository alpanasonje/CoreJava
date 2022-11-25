package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(40);
	ll.addFirst(5);
	ll.add(2,60);
	ll.addLast(25);
	System.out.println(ll);
	System.out.println("First Element is "+ll.getFirst());
	System.out.println("Last Element is "+ll.getLast());
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	ListIterator<Integer> li=ll.listIterator();
	
	  while(li.hasNext()) System.out.print(li.next()+"\t");
	 
	System.out.println("-----------------------");
	li=ll.listIterator(ll.size());
	while(li.hasPrevious())
	{
		int n=li.previous();
		System.out.print(n+"\t");
		if (n==20)		
			li.add(99999);
		if (n==60)
			li.set(5555);
	}
	System.out.println(ll);
	Collections.sort(ll);;
	System.out.println(ll);
	//ll.add("Hi");
	
	LinkedList<Student> studentList=new LinkedList<Student>();
	Student s1=new Student(11,"Pooja",78);
	studentList.add(s1);
	 s1=new Student(21,"Nikita",85);
	 studentList.add(s1);
	 s1=new Student(13,"Deepa",68);
	 studentList.add(s1);
	 s1=new Student(41,"Neha",72);
	 studentList.add(s1);
	 System.out.println(studentList);
	 //Collections.sort(studentList);
	}
}
