
public class Consumer extends Thread {
	Factory f;
	Consumer(Factory f, String name)
	{
		this.f=f;
		//setName(name);
		start();
	}
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			f.get();
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
