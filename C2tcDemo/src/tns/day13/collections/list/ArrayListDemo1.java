package tns.day13.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generics - type safe
		List<Integer> list1 = new ArrayList<Integer>(); // Homogeneous list of Integers
		/*
		 * CTE list1.add("Hello"); list1.add(false);
		 */
		list1.add(10);
		list1.add(60);
		list1.add(90);
		list1.add(50);
		list1.add(20);
		list1.add(50);

		System.out.println("Original List : " + list1);

		Collections.sort(list1);
		System.out.println("After Sorting : " + list1);
		Collections.reverse(list1);
		System.out.println("Sorting in Descending order using reverse : " + list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("Java");
		list2.add("Python");
		list2.add("C++");
		list2.add("HTML");
		list2.add("CSS");
		System.out.println("Original List : " + list2);
		Collections.sort(list2);
		System.out.println("After Sorting : " + list2);
		Collections.reverse(list2);
		System.out.println("Sorting in Descending order using reverse : " + list2);

		/*
		 * Iterator it = list1.iterator(); while (it.hasNext()) { Integer n =(Integer)
		 * it.next(); System.out.println(n + " : "+n*n); }
		 */
		Iterator<Integer> it = list1.iterator(); // to traverse a collection
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n + " : " + n * n);
		}

	}

}
