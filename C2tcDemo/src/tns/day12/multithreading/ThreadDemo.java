package tns.day12.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ChildThread1 t1 = new ChildThread1("Thread1");
		ChildThread1 t2 = new ChildThread1("Thread2");
		t1.start();
		t2.start();
		for (int i = 1; i <= 20; i++) {
			System.out.println("\t\t"+i + " : " + Thread.currentThread().getName());

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("--------------------------------------------");
	}

}
