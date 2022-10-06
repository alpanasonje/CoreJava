package com.capgemini.lesson10;

import java.util.Arrays;


class NewForArray
{
	public static void main(String args[])
	{
		int j=0;
		int[] squares={1,4,9,16,25};
		System.out.println(squares.length);
		System.out.println(Arrays.binarySearch(squares,16));
		int num[]=Arrays.copyOf(squares, 3);
		System.out.println(num.length);
		for(int n:num)
			System.out.println(n);
		for(int i:squares)
		{
			System.out.println("The square of "+(++j)+" is "+i);
		}
		
		int val2[]=Arrays.copyOfRange(squares, 2, 10);
		System.out.println("Length of val2 : "+val2.length);
		for(int val:val2)
			System.out.println("j"+val);
		Arrays.fill(squares, 100);
		j=0;
		for(int i:squares)
		{
			System.out.println("The square of "+(j++)+" is "+i);
		}
	}
}
