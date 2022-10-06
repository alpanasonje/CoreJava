
public class InterThreadCommunication {

	public static void main(String[] args) {
		Factory f=new Factory(); //Shared Resource
		Producer p1=new Producer(f,"Producer");
		Consumer c1=new Consumer(f,"Consumer");

	}

}
