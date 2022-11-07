package exceptionex;

import java.util.Scanner;

public class UsingFinally {
	public static void main(String args[]) {
		int a;
		int b, c;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two Numbers ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is " + c);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (Exception e) {
			System.out.println("Error Occured..." + e);
		}
		finally
		{
			System.out.println("In finaly block");
		}
		System.out.println("-------------------------");
	}

}
