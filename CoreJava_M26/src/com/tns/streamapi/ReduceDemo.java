package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,-3,4,5,-6,7,8);
		Optional<Integer> result = intList.stream().filter((a)->a>0).reduce((a,b)->a>b?a:b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());
		}
		
		result = intList.stream().filter((a)->a>0).reduce((a,b)->a+b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());}
		
		result = intList.stream().filter((a)->a%2==0).reduce((a,b)->a+b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());
		}
	}

}
