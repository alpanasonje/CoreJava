package tns.day6.Interface;

public class ChildExtendInterfaceClass implements ExtendingInterface {

	@Override
	public void show() {
		System.out.println("Parent interface method");

	}

	@Override
	public String greet(String name) {
		
		return "Good Evening "+name;
	}

}
