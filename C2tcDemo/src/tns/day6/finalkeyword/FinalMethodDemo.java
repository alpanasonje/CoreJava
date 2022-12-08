package tns.day6.finalkeyword;

public class FinalMethodDemo {

	public static void main(String[] args) {
		FinalMethodClass f1;
		
		f1=new FinalMethodClass();
		f1.show(); //parent class method
		f1.display();
		
		Child c1=new Child();
		c1.show();
		c1.display();
		
		//Runtime Polymorphism/ Late Binding / Dynamic Binding
		f1=new Child();
		f1.show(); //child class method

	}
}
