package com.cg.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import exceptionex.InvalidPriceException;
import exceptionex.Product;

public class ArrayListDemo {
	public static void main(String[] args) throws InvalidPriceException {
		ArrayList a1 = new ArrayList(); // empty Heterogeneous(Raw) collection
		System.out.println(a1.size());
		a1.add("Java");
		a1.add(10);
		a1.add(true);
		a1.add(234.77f);
		System.out.println(a1);
		a1.add(20);
		System.out.println(a1.add(10));
		System.out.println(a1);

		a1.add(2, false);
		System.out.println(a1);

		// System.out.println(a1.remove("c++")); return false
		System.out.println(a1.remove("Java"));
		System.out.println(a1);

		// System.out.println(a1.remove(10)); throws exception
		System.out.println(a1.remove(2));
		System.out.println(a1);

		Iterator i = a1.iterator();
	
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(a1.contains(true));
		System.out.println(a1.get(4));
		//Collections.sort(a1);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);

		// Generics
		ArrayList<String> a2 = new ArrayList<String>(); // Homogeneous collection
		a2.add("Core Java");
		a2.add("Hibernate");
		a2.add("Spring boot");
		a2.add("HTML/CSS");
		a2.add("Javascript");
		a2.add("React/Angular");
		// a2.add(true); compile time error
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		System.out.println("--------------------------");
		//Lambda Expression - Descending Order
		Comparator<String> c1= (s2,s1) -> s1.compareTo(s2);
		Collections.sort(a2,c1);
		System.out.println(a2);

		ArrayList<Product> a3 = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setQuantity(10);
		p1.setPrice(500);
		p1.setName("Notebook");
		a3.add(p1);
		p1 = new Product();
		p1.setProductId(102);
		p1.setQuantity(10);
		p1.setPrice(450);
		p1.setName("Book");
		a3.add(p1);
		p1 = new Product();
		p1.setProductId(103);
		p1.setQuantity(10);
		p1.setPrice(1400);
		p1.setName("Pen");
		System.out.println(p1);
		a3.add(p1);
		//a3.add("Products");
		System.out.println(a3);
	//Example of Comparable - Product implements Comparable
		Collections.sort(a3); //Compile time error - old Product class
		
		System.out.println("After Sorting.....");
		System.out.println(a3);
		
		
//Example of Comparator
		List<Emp> a4=new ArrayList<Emp>();
		a4.add(new Emp(1001,"Sarvesh",67000));
		a4.add(new Emp(1004,"Nilesh",87000));
		a4.add(new Emp(1008,"Mahesh",72000));
		a4.add(new Emp(1002,"Devesh",55000));
		System.out.println("Employee Details Before Sorting\n"+a4);
		//Collections.sort(a4, new SortByEmpId());
		//Collections.sort(a4,new SortByEmpName());
		Collections.sort(a4,new SortByEmpSalary());
		System.out.println("Employee Details After Sorting\n"+a4);
		
		//Using Lambda Expression 
		/* 
		 * Comparator<Product> c2= (pr2,pr1) -> (int)(pr1.getPrice()-pr2.getPrice());
		 * Collections.sort(a3,c2);
		 */
	}

}
