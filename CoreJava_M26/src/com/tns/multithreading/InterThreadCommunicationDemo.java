//Program to demonstrate interthread communication
package com.tns.multithreading;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		Agent obj=new Agent();
		Producer p1=new Producer(obj);
		Consumer c1=new Consumer(obj);
		
		p1.start();
		c1.start();
		
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}