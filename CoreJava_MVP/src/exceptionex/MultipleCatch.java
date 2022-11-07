package exceptionex;

public class MultipleCatch {

	public static void main(String[] args) {

		int a;
		int b, c;

		 //a=Integer.parseInt(args[0]);

		try {

			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

			c = a / b;

			System.out.println("Division is " + c);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		} catch (Exception e) {
			System.out.println("Error Occured..." + e);
		}
		System.out.println("-------------------------");
	}
}
