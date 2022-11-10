package com.cg.javacollections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(60);
		h1.add(40);
		h1.add(50);
		System.out.println(h1);
		h1.add(40);
		System.out.println("First Set : "+h1);
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(10);
		h2.add(200);
		h2.add(600);
		h2.add(40);
		h2.add(500);
		System.out.println("Second Set: "+h2);
		
		/* Union of two sets
		 * h1.addAll(h2); System.out.println("First Set : "+h1);
		 */
		//First Set : [50, 20, 500, 40, 200, 600, 10, 60]
		/* Set Difference h1-h2
		 * h1.removeAll(h2); System.out.println("First Set : "+h1);
		 */
		//First Set : [50, 20, 60]
		//Intersection of two sets
		h1.retainAll(h2);
		System.out.println("First Set : "+h1);
		//First Set : [40, 10]
	}

}
