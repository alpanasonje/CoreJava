//Use of join() method
class ChildT extends Thread
{
	ChildT()
	{}
	ChildT(String name)
	{
		setName(name);
	}
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(currentThread()+" "+i + " : "+ i*i);
			try {
				System.out.println(currentThread().isAlive());
				sleep(100);
				
			} catch (InterruptedException e) {
				System.out.println(currentThread().isAlive());
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		ChildT ch1=new ChildT("First Thread");
		ChildT ch2=new ChildT("Second Thread");
		ch1.start();
		ch2.start();
		
		  try { ch1.join(); ch2.join(); } 
		  catch (InterruptedException e) { 
		  e.printStackTrace();
		  }
		 
		System.out.println("----------------------------------"+Thread.currentThread());

	}

}
