package com.tns.multithreading;

public class ThreadSynchDemo {

	public static void main(String[] args) {
		Display display=new Display();
		Thread1 t1=new Thread1(display, "   Amol","Thread1");
		
		Thread1 t2=new Thread1(display,"Abhi","Thread2");
		
			
			t1.start();
			t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	System.out.println("---------------------------------------");	

	}

}


