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
		//singleton
		MyClass o1=MyClass.factory();
		MyClass.count();
		
		System.out.println("Creating one more reference ....");
		MyClass o2=MyClass.factory();
		MyClass.count();
		
		//not a singleton
		MyClass m1=MyClass.getMyClass();
		MyClass.count();
		MyClass m2=MyClass.getMyClass();
		MyClass.count();
	}

}
