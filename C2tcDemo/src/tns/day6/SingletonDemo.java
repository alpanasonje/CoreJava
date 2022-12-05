package tns.day6;

public class SingletonDemo {

	public static void main(String[] args) {
		//MyClass m1=new MyClass(); private constructor can't accessible
		
		MyClass m1=MyClass.getMyClass("Amit");//using factory method
		m1.show();
		
		MyClass m2= MyClass.getMyClass("Amol");
		m2.show();
		
		//Singleton
		
		MyClass1 m11=MyClass1.getObject("Pooja");
		m11.show();
		
		MyClass1 m12=MyClass1.getObject("Pratiksha");
		m12.show();
		
		System.out.println("-----------------------------");
		m11.show();
		m12.show();
	}

}
