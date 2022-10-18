package com.cg.usingabstract;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount("Amit", "Pune", 101, 45000);
		System.out.println(sa);
		sa.deposit(12000);
		System.out.println(sa);
		sa.withdraw(5000);
		System.out.println(sa);
		sa.withdraw(70000);
		System.out.println(sa);

	}

}
