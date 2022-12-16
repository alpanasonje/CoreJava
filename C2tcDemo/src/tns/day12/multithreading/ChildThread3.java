package tns.day12.multithreading;

public class ChildThread3 implements Runnable{

	private String message;
	private int times;
	Thread t;
	ChildThread3(String message, int times)
	{
		this.message=message;
		this.times=times;
		t=new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i=1;i<=times;i++)
			System.out.println(message);		
	}
}
