package com.tns.multithreading;

//Producer class
public class Producer extends Thread{
	Agent obj;

	public Producer(Agent obj) {
		
		this.obj = obj;
	}
	
public void run()
{
	  int i=0;
	  for(int j=0;j<10;j++)
	  {
		  try
		  {
			  Thread.sleep(300);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  obj.set(i);
		  i++;
	  }
}
}