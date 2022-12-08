package com.tns.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		// Creating objects of ChildThread - extends Thread
		ChildThread t1 = new ChildThread("Thread1");
		ChildThread t2 = new ChildThread("Thread2");
        t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(1);
        t1.start();
		t2.start();

		// Creating objects of ChildThread - implements Runnable
		ChildThread1 ch1 = new ChildThread1("Good Afternoon", 5);
		Thread t3 = new Thread(ch1);
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();

		// Creating objects of ChildThread - implements Runnable
		ChildThread2 ch2 = new ChildThread2("Bye", 2);

		System.out.println(t1.getName() + "is alive = " + t1.isAlive());
		System.out.println("--------------------------Main----------------------");
	}

}
