package tns.day6.Interface;

public class ChildMultipleInhClass implements InterfaceOne, InterfaceTwo {

	@Override
	public void display() {
		System.out.println("Interface two method");
	}

	@Override
	public void show() {
		System.out.println("Interface one method");
		
	}

}

