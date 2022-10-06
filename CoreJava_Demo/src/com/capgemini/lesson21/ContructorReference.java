package com.capgemini.lesson21;

import java.util.function.Supplier;

public class ContructorReference {

	public static void main(String[] args) {
		
		Supplier<Item> s1 = Item::new;
		System.out.println(s1.get().getName());
		System.out.println(s1.get().getPrice());

		
	}
}
