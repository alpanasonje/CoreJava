package tns.day6;

public class MyClass1 {
	private String name;
	private int cnt; 
	
	private static MyClass1 obj=new MyClass1();
	
	private MyClass1() {
		cnt++;
	}
	
	public static MyClass1 getObject(String name) // Factory Method
	{
		obj.name=name;
		return obj;
	}

	public void show() {
		System.out.println("Name is " + name);
		System.out.println("Object Created .."+cnt);
	}
}
