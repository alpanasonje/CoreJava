package exceptionex;

public class UsingTryCatch {

	public static void main(String[] args) {
		int a, b, c;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			if (b==0)
				throw new ArithmeticException();
			else
				c = a / b;
			System.out.println("Division is " + c);
		} 
		catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		}
	}
}