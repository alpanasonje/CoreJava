public class Producer extends Thread{
	Factory f;
	Producer(Factory f, String name)
	{
		this.f=f;
		//setName(name);
		start();
	}
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			f.set(i);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
