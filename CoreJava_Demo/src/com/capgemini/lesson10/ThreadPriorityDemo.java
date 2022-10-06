package com.capgemini.lesson10;

public class ThreadPriorityDemo extends Thread {

	public void run(){  
		   System.out.printf("Running thread name is: %s \n",Thread.currentThread().getName());  
		   System.out.printf("Running thread priority is: %d \n",Thread.currentThread().getPriority());  
		  
		  }  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadPriorityDemo thread1=new ThreadPriorityDemo();  
		  ThreadPriorityDemo thread2=new ThreadPriorityDemo();  
		 
		  thread1.setPriority(Thread.MIN_PRIORITY);  
		  thread2.setPriority(Thread.MAX_PRIORITY);  
		  thread1.start();  
		  thread2.start();  
		
		  System.out.println("Thread Current Priority ="+Thread.currentThread().getPriority());
		
	}

}
