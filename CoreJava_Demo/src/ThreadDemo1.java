class Thread1 extends Thread
{
	Thread1(){}
	Thread1(String name)
	{
		super(name);
	};
	@Override
	public void run()
	{
		System.out.println("Using Thread1..."+Thread.currentThread().getName());
	}
}
class Thread2 implements Runnable
{
	Thread2(){}
	Thread2(String name)
	{
		Thread.currentThread().setName(name);
	}
	@Override
	public void run() {
		System.out.println("Using Runnable..."+Thread.currentThread().getName());	
	}	
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1("Child Thread1");
		t1.start();
		System.out.println("Using Main Thread...."+Thread.currentThread().getName());
		
		Thread t2=new Thread(new Thread2("Child Thread2"));
		t2.start();
		System.out.println("End of Main Thread...."+Thread.currentThread().getName());
	}
}
