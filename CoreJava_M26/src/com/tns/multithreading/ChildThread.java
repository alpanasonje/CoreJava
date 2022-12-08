package com.tns.multithreading;



public class ChildThread extends Thread {
	ChildThread(String name) {
		super(name);
		System.out.println(currentThread().getName()+"is alive "+currentThread().isAlive());
		//start();
		
	}

	@Override
	public void run()  {
		System.out.println(currentThread().getName()+"is alive "+currentThread().isAlive());
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + "\t:\t" + i * i + " - " + Thread.currentThread());
			try {
				sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		System.out.println(currentThread().getName()+"is alive "+currentThread().isAlive());
	}
}
