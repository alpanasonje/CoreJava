package tns.day11.exceptions;

public class WithTryCatch {


	public static void division(int a, int b) {
		int c=0;
		/*
		 * try {
		 */c=a / b;
			System.out.println("Division is "+c);
			/*
			 * } catch(ArithmeticException e) { System.err.println("Error occurred ...."+e);
			 * }
			 */
	
	}

	public static void main(String[] args) {
		
	try
	{
		division(12,0);
	}
	catch(ArithmeticException e) { System.err.println("Error occurred ...."+e);
	 }
		
		System.out.println("-----------------------------------------------");
	}

}
