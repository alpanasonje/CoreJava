package com.capgemini.lesson12;

import java.util.*;

class Fruit {
	public String name;

	Fruit(String n) {
		name = n;
	}
}

class ItTest {
	public static void main(String[] args) {
		List<Fruit> d = new ArrayList<Fruit>();
		Fruit f = new Fruit("Apple");
		d.add(f);
		d.add(new Fruit("Pear"));
		d.add(new Fruit("Orange"));
		Iterator<Fruit> i3 = d.iterator(); // make an iterator
		while (i3.hasNext()) {
			Fruit d2 = i3.next(); // cast not required
			System.out.println(d2.name);
		}
		System.out.println("size of collection : " + d.size());
		System.out.println("get element at index position 1 : " + d.get(1).name);
		d.remove(2);
		Object[] oa = d.toArray();
		for (Object o : oa) {
			Fruit d2 = (Fruit) o;
			System.out.println(d2.name);
		}
	}
}
