package com.cg.javacollections;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		lh.add(10);
		lh.add(20);
		lh.add(60);
		lh.add(40);
		lh.add(50);
		System.out.println(lh);
		lh.add(40);
		System.out.println(lh);
		//Collections.sort(lh);
		
	}

}
