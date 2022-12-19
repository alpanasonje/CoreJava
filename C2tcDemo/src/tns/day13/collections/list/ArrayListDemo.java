package tns.day13.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list1 = new ArrayList(); // Heterogeneous list
		list1.add(10);
		list1.add("Hello");
		list1.add(false);
		list1.add(10);
		list1.add(true);
		list1.add(50);
		list1.add("Hello");
		System.out.println(list1);

		System.out.println(list1.size());

		System.out.println("Element 50 is present or not? " + list1.contains(50));

		System.out.println("Element at location 2 is : " + list1.get(2));

		System.out.println("Index of 10 is : " + list1.indexOf(10));

		List list2 = new ArrayList();
		list2.add(10);

		list1.removeAll(list2);
		System.out.println(list1);

		if (list1.indexOf(10) != -1)
			System.out.println(list1.remove(list1.indexOf(10)) + " is removed"); // passing index

		System.out.println(list1);

		list1.remove("Hello"); // passing object

		System.out.println(list1);

		Iterator it = list1.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		Collections.sort(list1);

	}
	


}
