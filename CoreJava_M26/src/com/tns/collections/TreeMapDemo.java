package com.tns.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		courses.put("Core Java", 25);
		courses.put("Python", 30);
		courses.put("Hibernate", 6);
		System.out.println(courses.put("C++", 15));
		courses.put("Springboot", 15);
		System.out.println(courses.put("C++", 20));
		// courses.put(null,null); //RTE
		courses.put("HTML", null);
		// courses.put(12,66); CTE
		System.out.println("Courses are : " + courses);

		TreeMap<Student, String> students = new TreeMap<Student, String>();
		students.put(new Student(101, "Harshita", 67),"TY");
		students.put(new Student(102, "Sheetal", 72),"FY");
		students.put(new Student(104, "Pallavi", 71),"SY");
		students.put(new Student(103, "Anisha", 87),"BE");
		System.out.println(students);

	}

}
