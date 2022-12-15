package tns.day11.exceptions;

public class WithoutTryCatch {

	public static float division(float a, float b) {
		return a / b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println("Division is " + division(12.5f, 2f));
		System.out.println("Division is " + division(12.5f, 0f));

		System.out.println("Division is " + division(12, 3));
		System.out.println("Division is "+division(12,0));
			
		 
		System.out.println("-----------------------------------------------");
	}

}
