package com.capgemini.lesson6.basic;

public class FunctionDemo {
	// function - block of code used to perform a specific task
	/*
	 * syntax return-type nameoffunction(parameter list) {
	 * 
	 * }
	 */
	// to display some msg
	void show() {
		System.out.println("Simple function");
	}

	// to return addition of two numbers
	static int add(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	// to return division of two numbers
	float div(int a, int b) {
		return (float) a / b;
	}

	public static void main(String[] args) {

		FunctionDemo sp = new FunctionDemo();
		sp.show();
		System.out.println("Division is : " + sp.div(12, 5));

		StudPersonDemo sp1 = new StudPersonDemo("Hello");
		int c = add(12, 4);
		System.out.println("Addition is " + c);

		System.out.println("Addition is " + add(345, 67897));

		System.out.println("Addition is " + add(3, 0));

		System.out.println("Addition is " + add(-45, 97));

		System.out.println("Addition is " + add(300, 100));
	}
}
