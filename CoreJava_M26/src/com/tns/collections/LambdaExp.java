package com.tns.collections;

@FunctionalInterface
interface MaxFinder {
//single abstract method to find max between two numbers
public int maximum(int num1,int num2);
}

@FunctionalInterface
interface MinFinder{
	public int minimum(int a, int b);
}

@FunctionalInterface
interface IsOdd{
	public boolean CheckOdd(int a);
}

@FunctionalInterface
interface CalSquare{
	public int getSquare(int num);
	//public int getCube(int num);	
}



public class LambdaExp {
	public static void main(String args[])
	{
		MaxFinder finder = (num1,num2) ->
		num1>num2?num1:num2;
		
		int result = finder.maximum(10, 20);
		System.out.println("Maximum Number is : "+result);
		
		MinFinder f = (a,b) ->
		a<b?a:b;
		
		result=f.minimum(10, 20);
		System.out.println("Minimum Number is : "+result);
		
		IsOdd o=(a) ->
		a%2!=0?true:false;
		
		boolean res=o.CheckOdd(7);
				System.out.println("Result is :"+res);
				
		CalSquare sqr=num->
			num*num;
		
		result=sqr.getSquare(4);
		System.out.println("Square is "+result);
	}
}


