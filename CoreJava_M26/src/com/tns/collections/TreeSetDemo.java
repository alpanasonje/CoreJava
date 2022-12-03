package com.tns.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/*
		 * TreeSet<String> courses=new TreeSet<String>(); courses.add("Core Java");
		 * courses.add("Python"); courses.add("Hibernate");
		 * System.out.println(courses.add("C++")); courses.add("Springboot");
		 * System.out.println(courses.add("C++")); // courses.add(null); RTE //
		 * courses.add(12); CTE System.out.println("Courses are : "+courses);
		 * 
		 * 
		 * 
		 * //Backed Collection SortedSet<String>
		 * coursesSubSet=courses.subSet("JavaScript",true, "Springboot",true);
		 * System.out.println(coursesSubSet); courses.add("HTML");
		 * courses.add("JavaScript"); courses.add("React"); System.out.println(courses);
		 * System.out.println(coursesSubSet); coursesSubSet.remove("Python");
		 * System.out.println(courses); System.out.println(coursesSubSet);
		 * TreeSet<Student> students=new TreeSet<Student>(); students.add(new
		 * Student(101,"Harshita",67)); students.add(new Student(102,"Sheetal",72));
		 * students.add(new Student(104,"Pallavi",71)); students.add(new
		 * Student(103,"Anisha",87)); System.out.println(students);
		 */
		
		
		TreeSet<Integer> numberSet=new TreeSet<Integer>();
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(60);
		numberSet.add(80);
		numberSet.add(30);
		System.out.println(numberSet);
		SortedSet<Integer> numberSet1=numberSet.subSet(30,false, 60,true);
		System.out.println(numberSet);
		System.out.println(numberSet1);
		numberSet.add(400);
		numberSet.add(50);
		System.out.println(numberSet);
		System.out.println(numberSet1);
		numberSet1.add(35);
		//numberSet1.add(90);// RTE IllegalArgumentException - Key out of range
		System.out.println(numberSet);
		System.out.println(numberSet1);
		
		//SortedSet<Student> studentsSubSet = students.subSet(null, null)
	}

}
