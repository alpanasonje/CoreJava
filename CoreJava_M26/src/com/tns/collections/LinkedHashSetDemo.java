package com.tns.collections;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//ordered, unsorted set
		LinkedHashSet<Integer> lhset =new LinkedHashSet<Integer>();
		lhset.add(10);
		lhset.add(40);
		lhset.add(20);
		lhset.add(70);
		lhset.add(60);
		lhset.add(30);
		lhset.add(10);
		System.out.println("LinkedHashSet : "+lhset);
	//	Collections.sort(lhset); CTE
		
		
	}

}
