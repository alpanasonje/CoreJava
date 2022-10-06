package com.capgemini.lesson11;

import java.util.*;

class HashTableDemo {
	public static void main(String args[]) {
		// Create a hash map
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration names;
		String str;
		double bal;

		balance.put("Arun", new Double(3434.34));
		balance.put("Radha", new Double(123.22));
		balance.put("Ram", new Double(99.22));

		// Show all balances in hash table.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		// Deposit 1,000 into Zara's account
		bal = ((Double) balance.get("Ram")).doubleValue();
		balance.put("Ram", new Double(bal + 1000));
		System.out.println("Ram's new balance: " + balance.get("Ram"));
	}
}
