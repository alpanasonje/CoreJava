package lesson5;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("What's your name? ");
	            String input = scanner.nextLine();
	            if (input.isEmpty()) 
	            {
	                break;
	            }
	            System.out.println("Your name is " + input + ". ");
	        }
	        scanner.close();
	        System.out.println("Good bye");
	}
}
