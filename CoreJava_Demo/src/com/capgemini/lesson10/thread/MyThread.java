package com.capgemini.lesson10.thread;

public class MyThread extends Thread {

	public MyThread(String name){
		
		super(name);
		
	}
	public void run(){
		
		for(int num=0;num<5;num++){
			
			System.out.println(this.getName()+" "+num);
		}
		
		
	}
	
	
	

}
