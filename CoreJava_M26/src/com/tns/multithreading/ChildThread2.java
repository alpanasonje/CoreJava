package com.tns.multithreading;

public class ChildThread2 implements Runnable {
	String message;
	int num;
	Thread t;
	ChildThread2(String message, int num) {
		this.message = message;
		this.num = num;
		t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= num; i++)
		{
			System.out.println(message);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
