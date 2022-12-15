//Executor class
package com.tns.multithreading;

public class SynchronizationDemo {


	public static void main(String[] args) {
		Account a1 = new Account(101,"Amit",10000);
		
		WithdrawThread wt1 = new WithdrawThread(a1, 5000);
		WithdrawThread wt2 = new WithdrawThread(a1, 7000);
		WithdrawThread wt3 = new WithdrawThread(a1, 2000);
		wt1.start();
		wt2.start();		
		wt3.start();
		/*
		 * try { wt1.join(); wt2.join(); // wt3.join(); } catch (Exception e) {
		 * System.out.println(e); }
		 */
		
	}
}