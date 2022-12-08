package tns.day6.Interface;

public class InterfaceDemo {

	public static void main(String[] args) {
		ChildInterfaceClass ch1=new ChildInterfaceClass();
		ch1.show();
		
		ChildMultipleInhClass cm1=new ChildMultipleInhClass();
		cm1.show();
		cm1.display();
		
		
		ChildExtendInterfaceClass ce=new ChildExtendInterfaceClass();
		ce.show();
		System.out.println(ce.greet("Neha"));
	}

}
