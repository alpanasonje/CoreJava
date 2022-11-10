package com.cg.javacollections;

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
		System.out.println("TreeSet : "+t1);
		
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
		
		
	}

}
