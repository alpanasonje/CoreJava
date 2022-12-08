package com.tns.multithreading;

public class Thread1 extends Thread {
	Display display;
	String name;

	public Thread1(Display display, String name, String tname) {
		super(tname);
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		synchronized (display) 
		{
		display.wish(name);
		}
	}

}
