package lesson4.singleton;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Following statement will not work as
		 * constructor is private
		 * MyClass obj=new MyClass();
		 */
			
		MyClass obj=MyClass.factory();
		MyClass.count();
		
		System.out.println("Creating one more reference ....");
		MyClass obj1=MyClass.factory();
		MyClass.count();
		
	}

}
