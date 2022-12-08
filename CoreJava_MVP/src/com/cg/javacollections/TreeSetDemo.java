package com.cg.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import exceptionex.InvalidPriceException;
import exceptionex.Product;

public class TreeSetDemo {

	public static void main(String[] args) throws InvalidPriceException{
		TreeSet t=new TreeSet();//TreeSet is derived from SortedSet
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(12);
		
		/* Runtime Error - ClassCastException
		 * t.add("Hello"); t.add(true); t.add(45.60);
		 */
		System.out.println("TreeSet : "+t);
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("C");
		t1.add("A");
		t1.add("F");
		t1.add("B");
		t1.add("D");
	//	t1.add(null); throws NullPointerException - from JDK 7 null not allowed
		//t1.add(10);compile time error
		
		//BackedCollection
		System.out.println("TreeSet : "+t1);
		SortedSet<String> ss=t1.subSet("B", "F");
		System.out.println("Using Subset "+ss);
		t1.add("E");
		System.out.println("TreeSet : "+t1);
		System.out.println("Using Subset "+ss);
		ss.remove("C");
		System.out.println("TreeSet : "+t1);
		System.out.println("Using Subset "+ss);
		
		
		TreeSet<Product> t2=new TreeSet<Product>();
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setQuantity(10);
		p1.setPrice(500);
		p1.setName("Notebook");
		t2.add(p1); //ClassCastException
		
		p1=new Product();
		p1.setProductId(102);
		p1.setQuantity(10);
		p1.setPrice(450);
		p1.setName("Book");
		t2.add(p1);
		
		p1 = new Product();
		p1.setProductId(103);
		p1.setQuantity(10);
		p1.setPrice(1400);
		p1.setName("Pen");
		t2.add(p1);
		System.out.println("Treeset "+t2);
		
		//Example of Comparator
		
				TreeSet<Emp> a4=new TreeSet<Emp>(new SortByEmpName());
				a4.add(new Emp(1001,"Sarvesh",67000));
				a4.add(new Emp(1004,"Nilesh",87000));
				a4.add(new Emp(1008,"Mahesh",72000));
				a4.add(new Emp(1002,"Devesh",55000));
				System.out.println("Employee Details \n"+a4);
				//Collections.sort(a4, new SortByEmpId());
				//Collections.sort(a4,new SortByEmpName());
			//	Collections.sort(a4,new SortByEmpSalary());
			//	System.out.println("Employee Details After Sorting\n"+a4);
		
		
	}

}
