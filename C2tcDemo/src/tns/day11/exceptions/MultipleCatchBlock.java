package tns.day11.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void division() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int[] arr = { 40, 60 };
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is " + c);
			System.out.println(arr[2]);
		}
		catch (Exception e) {
			System.out.println("Error Occurred.." + e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("Error Occurred.." + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input " + e);
		} 
	}

	public static void main(String[] args) {
		division();
		System.out.println("---------------------------------");
	}

}
