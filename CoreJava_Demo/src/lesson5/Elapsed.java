package lesson5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Elapsed {

	public static void main(String args[]) throws IOException {
		long start, end;
		int i = 0, sum = 0;
		String str = null;
	    System.out.println("Timing a for loop from 0 to 1,000,000");

		// time a for loop from 0 to 1,000,000    
		start = System.currentTimeMillis(); // get starting time
		
		for(int j=0; j < 1000000; j++) ;
		
		end = System.currentTimeMillis(); // get ending time

		System.out.println("Elapsed time: " + (end-start));

		// Demo to read from the system input and write to standard output.
		BufferedReader br = new
		  BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("Enter 0 to quit");
			str = br.readLine();
			i = Integer.parseInt(str);
			if ( i == 0 )
				//break; // terminate the do..while loop
				System.exit(0); // normal exit - to terminate the program execution
			sum += i;
			System.out.println("Current sum is: " + sum);
		} while(i != 0);
		System.out.println("--------------------------------------");
	}
}
