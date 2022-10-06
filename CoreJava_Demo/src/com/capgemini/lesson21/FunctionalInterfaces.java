package com.capgemini.lesson21;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (String str)-> System.out.println(str);
		consumer.accept("Hello LE!");
		Supplier<String> supplier = () -> "Hello from Supplier!";
		consumer.accept(supplier.get());
		//even number test
		Predicate<Integer> predicate = num -> num%2==0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(15));
		//max or min test
		BiFunction<Integer, Integer, Integer> maxFunction = (x,y)->x>y?x:y;
		System.out.println(maxFunction.apply(5, 14));
		
		
		
	}
}
