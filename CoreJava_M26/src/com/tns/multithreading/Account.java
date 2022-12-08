//Program to demonstrate Synchronization
//Service class

package com.tns.multithreading;

public class Account {
	int bal;

void setBal(int bal2) {
	 try {
		 Thread.sleep(2000);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 SynchronizationDemo.Balance=bal2;

}
int getBal() {	
	return SynchronizationDemo.Balance;
}
 public synchronized void withdraw(int amt) {
	System.out.println("Getting balance");
	bal=getBal();
	try {
	if(amt>(bal))
	{
		throw new Exception("Not Sufficient Balance");
	}
	else
	bal=bal-amt;
	}
	catch(Exception e) {
		{
			System.out.println("Check the balanace");
		}
	}
	setBal(bal);	
	System.err.println(SynchronizationDemo.Balance);
}
}