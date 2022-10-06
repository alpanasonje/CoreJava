package com.capgemini.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepDemo {

	 public static void main(String args[]) {
		        List<String> seasonList = new ArrayList<>();
		        seasonList = Arrays.asList(new String[]{
		            "Winter",
		            "Summer",
		            "Spring",
		            "Autumn"
		        });

		        for (String value : seasonList) {
		            //Pause for 4 seconds
		            try {
						Thread.sleep(4000);
					} catch (InterruptedException exp) {
						// TODO Auto-generated catch block
						System.err.println(exp.getMessage());
					}
		            //Print a message
		            System.out.println(value);
		        }
		    }
	
	
}
