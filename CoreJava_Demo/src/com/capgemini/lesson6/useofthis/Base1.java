package com.capgemini.lesson6.useofthis;

public abstract class Base1 {

	Base1()
	{
		this(30);
		System.out.println("Default Constructor from Base 1");
		
	}
	
	Base1(int i)
	{
		System.out.println("Constructor with int arg in BASE 1, i is "+i);
	}
	
}	
