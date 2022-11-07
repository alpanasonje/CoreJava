package exceptionex;

public class WithoutExHandling {

	public static void main(String[] args) {
		float a1,b1,c1;
		a1 = Float.parseFloat(args[0]);
		b1 = Float.parseFloat(args[1]);
		c1=a1/b1;
		System.out.println("Float division is "+c1);
		
		
		  int a, b, c; 
		  a = Integer.parseInt(args[2]); 
		  b = Integer.parseInt(args[3]); 
		  c  = a / b; 
		  System.out.println("division is " + c);
		 
		  System.out.println("--------------------------------------");
	}

}
