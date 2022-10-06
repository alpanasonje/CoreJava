package com.capgemini.lesson11;

import java.util.*;

class HashMapDemo {
	public static void main(String args[]) {
		// Create a hash map
		Map<String, Double> hm = new HashMap<String, Double>();

		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));

		// Get a set of the entries
		Set set = hm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}

		// Deposit 1000 into John Doe's account

		double balance = ((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
	}
}
