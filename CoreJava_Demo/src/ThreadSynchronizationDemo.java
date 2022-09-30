class GreetShared
{
	static int n;
	synchronized void greet(String name)
	{		
		for(int i=1;i<=5;i++)
		{
			System.out.println(" Hello ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	static synchronized void add(int i)
	{
		n+=i;
		System.out.println(n);
	}
}

class MyThread extends Thread
{
	String name;
	GreetShared greets;
	MyThread(GreetShared greets, String name)
	{
		this.name=name;
		this.greets=greets;
		start();
	}
	public void run()
	{
		//greets.greet(name);
		for(int i=1;i<=5;i++)
		greets.add(i);
	}
}

public class ThreadSynchronizationDemo {

	public static void main(String[] args) {
		GreetShared gs =new GreetShared();
		MyThread t1=new MyThread(gs,"Amit");
		MyThread t2=new MyThread(gs,"Pooja");
		
	}

}
