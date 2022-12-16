package tns.day12.multithreading;

public class ChildThread2 implements Runnable{

	private String message;
	private int times;
	
	ChildThread2(String message, int times)
	{
		this.message=message;
		this.times=times;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=times;i++)
			System.out.println(message);		
	}
}
