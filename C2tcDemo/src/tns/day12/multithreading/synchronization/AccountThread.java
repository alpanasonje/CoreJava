package tns.day12.multithreading.synchronization;

public class AccountThread extends Thread{
	Account acc;
	int amt;
	public AccountThread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		start();
	}
	@Override
	public void run()
	{
		/*
		 * synchronized (acc) { acc.withdraw(amt); }
		 */
		
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
