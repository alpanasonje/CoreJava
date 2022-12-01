package tns.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * int a; System.out.println("Enter Number : "); a=sc.nextInt();
		 * System.out.println("You entered : "+a);
		 */
		String name;
		System.out.println("Enter your name : ");
		//name=sc.next();
		
		name=sc.nextLine();
		System.out.println("Welcome "+name);
		sc.close();
	}

}
