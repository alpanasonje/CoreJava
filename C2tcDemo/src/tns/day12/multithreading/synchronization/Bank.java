package tns.day12.multithreading.synchronization;

public interface Bank {
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	void deposit(int amt) throws InsufficientBalanceException;
	void withdraw(int amt)throws InsufficientBalanceException;
}
