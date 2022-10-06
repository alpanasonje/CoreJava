
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
 import java.util.concurrent.Callable;
 
 class MultiplyingTask implements Callable
{
	int a;
	int b;
	long sleepTime;
 
	public MultiplyingTask(int a, int b, long sleepTime) {
		this.a=a;
		this.b=b;
		this.sleepTime=sleepTime;
		
	}
 
	@Override
	public Integer call() throws Exception {
		Thread.sleep(sleepTime);
		return a*b;
	}
}
 

 
public class ConcurrentThreadDemo
{ 
	public static void main(String[] args)
	{
		MultiplyingTask multiplyingTask1= new MultiplyingTask(10,20,2000l);
		MultiplyingTask multiplyingTask2= new MultiplyingTask(20,40,4000l);
 
		FutureTask<Integer> futureTask1=new FutureTask<>(multiplyingTask1);
		FutureTask<Integer> futureTask2=new FutureTask<>(multiplyingTask2);
 
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
 
		while(true)
		{
			try {
				if(!futureTask1.isDone())
				{
					System.out.println("FutureTask1 output="+futureTask1.get());
				}
				if(!futureTask2.isDone())
				{
					System.out.println("Waitng for futureTask2 for completion");
					System.out.println("FutureTask2 output="+futureTask2.get());
				}
				if(futureTask1.isDone() && futureTask2.isDone())
				{
					System.out.println("Completed both the FutureTasks, shutting down the executors");
					executor.shutdown();
					return;
				}
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
 
	}
}
 