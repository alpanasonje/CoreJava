package com.capgemini.lesson6.basic;

public class Base {
	/*
	 * Declaring default, public, private and protected variables 
	 */
	int var_default;
	public int var_public;
	private int var_private;
	protected int var_protected;
	
	/*
	 * Declaring methods with default, public, private, protected types
	 */

	void method_default()
	{
		System.out.println("Default access Base class");	
	}
	
	public void method_public()
	{
		System.out.println("Public access Base class");
	}
	
	private void method_private()
	{
		System.out.println("Private access Base class");
	}
	
	protected void method_protected()
	{
		System.out.println("Protected access Base class");
	}
	
}
