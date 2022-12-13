package tns.day7.arrays;

import java.util.Arrays;

public class OneDimArray {

	static void showArray(int [] arr)
	{
		//index based iterating 
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
	public static void main(String[] args) {
		// Array Declaration
		int[] a,a1; //both a and a1 are arrays
		int b[],b1; //b is an array while b1 is not array
		
		/*
		 * System.err.println(a1.length); System.err.println(b1.);
		 */
		//Creating array
		a=new int[5]; //allocates memory for 5 integers
		
		final int SIZE=10;
		b=new int[SIZE]; //allocates memory for 10 integers
		
		
		System.out.println("array a is as follows");
		showArray(a);
		
		System.out.println("array b is as follows");
		showArray(b);
		
		//Defining an array
		int c[]=new int[] {11,12,13};
		System.out.println("array c is as follows");
		showArray(c);
		
		//Declaration with initialization
		int d[]= {101,20,340,140,250};
		System.out.println("array d is as follows");
		showArray(d);
		
		Arrays.sort(d);
		System.out.println("array d after sorting is as follows");
		showArray(d);
		
		System.out.println("140 is found at "+Arrays.binarySearch(d, 140));
		
		System.out.println("40 is found at "+Arrays.binarySearch(d, 40));
		
		//for each loop
		for(int n:d)
			System.out.println(n);
		
		String []s= {"Hello","How are you?"};
		for(String str:s)
			System.out.println(str);
		
		
	}

}
