package tns.day12.multithreading;

public class ChildThread1 extends Thread {
	
	public ChildThread1(String name)
	{
		super();
		setName(name);
		//start();
	}
	
	@Override
	public void run()
	{
		char ch='A';
		for(int i=1;i<=26;i++,ch++)
		{
			System.out.println(ch+currentThread().getName());
			try {
				sleep(35);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
