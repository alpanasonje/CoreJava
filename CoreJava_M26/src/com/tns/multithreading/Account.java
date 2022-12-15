//Program to demonstrate Synchronization
//Service class

package com.tns.multithreading;

public class Account {
	static final int MIN_BALANCE = 1000;
	private int accNo;
	private int balance;
	private String name;

	public Account(int accNo, String name, int openBalance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = openBalance;
	}

	int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", name=" + name + "]";
	}

	public  synchronized void withdraw(int amt) {
		try {
			if ((balance - amt) < MIN_BALANCE) {
				throw new Exception("Insufficient Fund, Withdraw Operation Failed...");
			} else
				balance -= amt;
			System.out.println("Current Balance : "+balance);
		} catch (Exception e) {
			{
				System.out.println(e.getMessage());
			}
		}

	}
}