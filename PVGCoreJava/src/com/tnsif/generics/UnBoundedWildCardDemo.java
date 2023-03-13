//Program to demonstrate Unbounded wild card
package com.tnsif.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void display(List<?> ll) {
		for (Object o : ll) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("display values");
		display(l1);

		List<String> l2 = Arrays.asList("Hi", "Hello", "How are you");
		System.out.println("display values");
		display(l2);
		
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		List<Person> l3 = Arrays.asList(p);
		System.out.println("display values");
		display(l3);
	}
}