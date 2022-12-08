package tns.day5;

public class MyClassDemo {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		
		  MyClass o1=new MyClass(); o1.show(); 
		//static method with  class name
		  MyClass.display(); 
		   
		  MyClass o2=new MyClass(); o2.show(); MyClass.display();
		  MyClass o3=new MyClass(); o3.show(); MyClass.display();
		 
		System.out.println("------------------------------");
		
		
	
				
	}

}
