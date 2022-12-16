package tns.day12.multithreading.synchronization;

public class Account implements Bank {
	private int accNo;
	private String Name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + "]";
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		// TODO Auto-generated method stub

	}

	/*
	 * 
	 * @Override public void withdraw(int amt) { balance=balance-amt;
	 * System.out.println("Balance : "+balance); }
	 */

	// Synchronized method

	@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {
		
		if (balance - amt < MINBAL)
			throw new InsufficientBalanceException();
		else {
			balance = balance - amt;
			System.out.println("after withdrwing "+amt+" current Balance : " + balance);
		}
	}

}
