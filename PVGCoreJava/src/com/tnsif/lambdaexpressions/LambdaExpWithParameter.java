//Program to demonstrate Lambda expression with parameters
package com.tnsif.lambdaexpressions;

public class LambdaExpWithParameter {

	public static void main(String[] args) {
		
		Cube c = (a) -> {
			return (a * a * a);
		};
		System.out.println("Cube of 5 is "+c.calculate(5));

		Cube c1 = (a)->a*a*a;  // Finding the cube of a number			
		System.out.println("Cube of 4 is "+c1.calculate(4)); 

		IsOdd o = (a) -> a % 2 != 0 ? true : false;

		System.out.println("Is 7 Odd Number? :" +o.CheckOdd(7));
		System.out.println("Is 8 Odd Number? :" +o.CheckOdd(8));
	}

}