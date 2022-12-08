package com.tns.multithreading;

public class Display {
	
	//public synchronized void wish(String name)
	public void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println("Hello "+Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			System.out.println(name+" : "+Thread.currentThread().getName());
		}
	}

}


