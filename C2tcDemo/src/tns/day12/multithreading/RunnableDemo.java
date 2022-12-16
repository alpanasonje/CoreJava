package tns.day12.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		ChildThread2 t1 = new ChildThread2("Hello, Hi",15);
		Thread t=new Thread(t1);
		t.start();
		
		ChildThread3 tt=new ChildThread3("How are you?",20);
	

	}

}
