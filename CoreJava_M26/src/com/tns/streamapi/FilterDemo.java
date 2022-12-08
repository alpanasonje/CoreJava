package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		String city[]={"Pune","Mumbai","Chennai","Banglore","Noida"};
		List<String> locations = Arrays.asList(city);
		Stream<String> stream = locations.stream();
		List<String> result = stream.filter((location)->location.length()>5).collect(Collectors.toList());
		System.out.println(locations);
		result.stream().forEach((city1)->System.out.println(city1));
		
		Integer arr[]= {10,20,15,45,35,100};
		/*
		 * for(int i=0;i<arr.length;i++) { if (arr[i]%2==0) System.out.println(arr[i]);
		 * }
		 */
		List<Integer> evenNumList =Arrays.asList(arr).stream().filter((num)->num%2==0).collect(Collectors.toList());
	    System.out.println(evenNumList);
	    
	    List<Integer> numList=Arrays.asList(arr);
		/*
		 * for(int i=0;i<numList.size();i++) { if (numList.get(i)%2!=0)
		 * System.out.println(numList.get(i)); }
		 */
	    Arrays.asList(arr).stream().filter((num)->num%2!=0).forEach(System.out::println);
	    
	    
	    
	}

}
