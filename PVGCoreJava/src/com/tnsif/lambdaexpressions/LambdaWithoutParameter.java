//Program to demonstrate Lambda expression without parameters
package com.tnsif.lambdaexpressions;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		Statement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}