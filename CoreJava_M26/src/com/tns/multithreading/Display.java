package com.tns.multithreading;

public class Display {
	
	//public synchronized void wish(String name)
	public void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			try {
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			System.out.println(name+" : "+Thread.currentThread().getName());
		}
	}

}


