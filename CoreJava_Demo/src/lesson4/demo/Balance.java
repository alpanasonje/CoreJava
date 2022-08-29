// file Balance.java
package com.capgemini.lesson4.demo;

// if any import statement those can be placed here.

public class Balance {
	private String name;
	private double balance;

	public Balance(String name, double balance) {
		this.name = name;
	    this.balance = balance;
	}
 
	public void show() {
		if(balance<0) 
			System.out.print("-->> ");
		System.out.println(name + ": $" + balance);
	}
}
