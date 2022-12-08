package com.tns.multithreading;

//Consumer class
public class Consumer extends Thread {
	Agent obj;

	public Consumer(Agent obj) {
		this.obj = obj;
	}
	
public void run()
{
	  int i=0;
	  while(true)
	  {
		  try
		  {
			  Thread.sleep(3000);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  obj.get();
}
}
}


