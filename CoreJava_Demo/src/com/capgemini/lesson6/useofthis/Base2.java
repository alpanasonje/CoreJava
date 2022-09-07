package com.capgemini.lesson6.useofthis;

public class Base2 extends Base1{
	
	Base2()
	{
		System.out.println("Default Constructor in Base 2");
	}

	Base2(int i)
	{
		this(i,10);
		System.out.println("Constructor with int arg in BASE 2, i is "+i);
	}
	
	Base2(int i,int j)
	{
		System.out.println("Constructor with 2 int args in Base 2, i is "+i + "and j is "+j);
	}
}
