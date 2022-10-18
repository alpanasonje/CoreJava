package com.cg.usingabstract;

public class SavingAccount extends Person implements Bank
{
	private int accNo;
    private float balance;	
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {
		balance+=amount;	
		System.out.println("Amount Deposited...."+amount);
	}

	@Override
	public void withdraw(float amount) {
		if(amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Withdrawal successful....");
		}
		else
			System.out.println("Insufficient Balance...can't withdraw");
		
	}

	@Override
	public String toString() {
		return "SavingAccount [Name ="+getName()+"\tCity = "+getCity()+"\taccNo=" + accNo + ", balance=" + balance + "]";
	}
	

}
