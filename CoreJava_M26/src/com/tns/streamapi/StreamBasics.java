package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10,20,30,40,50);
		//System.out.println(stream.count());
		stream.map(num->num+10).forEach(System.out::println);
		
		
		Integer[] values = new Integer[] {10,20,30,13,10,11,12,13};
		stream = Arrays.stream(values);
		//System.out.println(stream.count());
		stream.map(num->num*num).forEach(System.out::println);
		Arrays.stream(values).limit(2).forEach(System.out :: println);
		Arrays.stream(values).skip(4).forEach(System.out :: println);
		Arrays.stream(values).distinct().forEach(System.out :: println);
		
		List<String> words = Arrays.asList("Hello","Stream","Learning");
		Stream<String> stream1=words.stream();
		
		//stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		List<String> s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		
	}

}
