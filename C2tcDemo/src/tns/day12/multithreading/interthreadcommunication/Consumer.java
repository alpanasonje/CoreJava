package tns.day12.multithreading.interthreadcommunication;

//Consumer class
public class Consumer extends Thread {
	Agent obj;

	public Consumer(Agent obj) {
		this.obj = obj;
	}
	
public void run()
{
	  
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


