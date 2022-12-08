//Service class
package com.tns.multithreading;

public class Agent {
	int a;
	boolean b = false;

	public synchronized void set(int a1) {
		if (b) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.a = a1;
		b = true;
		System.out.println("Set" + a);
		notify();
	}

	public synchronized void get() {
		if (!b) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Getting data " + a);
		b = false;
		notify();
	}
}