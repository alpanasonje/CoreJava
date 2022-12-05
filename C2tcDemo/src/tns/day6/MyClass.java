package tns.day6;

public class MyClass {
	private String name;

	private MyClass(String name) {
		this.name = name;

	}

	public static MyClass getMyClass(String name) // Factory Method
	{
		return new MyClass(name);
	}

	public void show() {
		System.out.println("Name is " + name);
	}
}
