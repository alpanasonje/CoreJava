package com.capgemini.lesson4.singleton;

public class MyClass {

	static MyClass obj=new MyClass();
	static int countobj;
	private MyClass()
	{
		System.out.println("MyClass object created");
		countobj++;
	}
	
	public static void count()
	{
		System.out.println("Total objects are :"+ countobj);
	}
	
	public static MyClass factory()
	{
		return obj;
	}
}
