//Program to demonstrate Functional Interfaces
package com.tnsif.lambdaexpressions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display {
	static void show(String s) {
		System.out.println("****" + s + "*********");
	}
}

public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		// Consumer Functional Interface
		Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
		consumer.accept("Neha");

		consumer = System.out::println; // method reference
		consumer.accept("Pooja");

		consumer = Display::show; // method reference
		consumer.accept("Java Programming");

		Supplier<String> supplier = () -> "Hello from Supplier!";
		System.out.println(supplier.get());

		// Positive/Negative number test
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));

		// max test
		BiFunction<Integer, Integer, Integer> maxFunction = (x, y) -> x > y ? x : y;
		System.out.println(maxFunction.apply(25, 14));

		BiFunction<String, Integer, String> printFunction = (name, num) -> name + num;
		System.out.println(printFunction.apply("Good Evening", 2));

	}

}
