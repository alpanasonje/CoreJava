package tns.day11.exceptions;

import java.util.Scanner;

public class UserDefExDemo {

	public static void main(String[] args) throws InvalidInputException {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		if(age<=0)
			throw new InvalidInputException();
		//throw new InvalidInputException("Age is invalid");
		System.out.println("Your age is "+age);
		
		System.out.println("Enter your percentage : ");
		float per=sc.nextFloat();
		if(per<0 || per>100)
			throw new InvalidInputException("Percentage is invalid");
		System.out.println("Your percentage is "+per);

	}

}
