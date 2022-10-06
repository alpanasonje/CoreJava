package com.capgemini.lesson21;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder finder = (num1,num2) -> num1>num2?num1:num2;
		int result = finder.maximum(10, 20);
		System.out.println(result);
	}
}
