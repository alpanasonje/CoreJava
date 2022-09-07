package lesson6.useoffinal.finalinside;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
		d.methodX();
		d.methodY();
		
		System.out.println("-------------------------------");
		
		Base b=new Derived();
		b.methodX();
		b.methodY();
		
		System.out.println("-------------------------------");
		
		Derived d1=(Derived)b;
		d1.methodX();
		d1.methodY();

		System.out.println("-------------------------------");
		
		Base b1=(Base)d;
		b1.methodX();
		b1.methodY();
	
	    System.out.println("-------------------------------");
	    System.out.println("To invoke methodX from Base \n call super.methodX() from Derived class");
	}

}
