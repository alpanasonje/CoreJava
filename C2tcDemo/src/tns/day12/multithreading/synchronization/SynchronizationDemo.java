package tns.day12.multithreading.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account a1=new Account(101,"Amit & Amol",50000);
		System.out.println(a1);
		/*
		 * AccountThread t1=new AccountThread(a1,20000); AccountThread t2=new
		 * AccountThread(a1,50000);
		 */
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++)
		{
			t[i]=new AccountThread(a1,1000*(i+1));			
		}
		try {
			for(int i=0;i<10;i++)
			{
			t[i].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //waits main thread till execution of t1 finish
		
		System.out.println(a1);
		

	}

}
