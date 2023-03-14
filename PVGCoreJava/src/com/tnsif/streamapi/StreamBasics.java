//Program to demonstrate Stream API Functions
package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {

		// creating a stream from set of values
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70);

		// counting no. of elements
		System.out.println("No. of elements : " + stream.count());
		// stream.forEach(System.out::println);

		Integer[] values = new Integer[] { 10, 20, 30, 13, 10, 11, 12, 13 };
		// creating a stream from Array
		stream = Arrays.stream(values);

		// map
		System.out.println("Squares of " + Arrays.toString(values) + " is as follows :");
		stream.map(num -> num * num).forEach(System.out::println);

		// limit System.out.println("First 2 elements are : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);

		// skip System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(4).forEach(System.out::println);

		// distinct System.out.println("Distincts Elements are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);

		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
		// creating a stream from a List
		Stream<String> stream1 = words.stream();

		// map
		System.out.println("Strings in uppercase : ");
		List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		stream1 = words.stream();
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);

	}

}
