package com.tns.multithreading;

public class ChildThread1 implements Runnable {
	String message;
	int num;

	ChildThread1(String message, int num) {
		this.message = message;
		this.num = num;
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
