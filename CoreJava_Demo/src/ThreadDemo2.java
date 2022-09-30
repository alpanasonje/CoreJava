class ChildThread extends Thread
{
	ChildThread()
	{}
	ChildThread(String name)
	{
		setName(name);
	}
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(currentThread()+" "+i + " : "+ i*i);
			try {
				System.out.println(currentThread().isAlive());
				sleep(200);
				
			} catch (InterruptedException e) {
				System.out.println(currentThread().isAlive());
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		ChildThread ch1=new ChildThread("First Thread");
		ChildThread ch2=new ChildThread("Second Thread");
		ch2.setPriority(Thread.MAX_PRIORITY);
		ch1.start();
		ch2.start();	 
		System.out.println("----------------------------------"+Thread.currentThread());
	}

}
