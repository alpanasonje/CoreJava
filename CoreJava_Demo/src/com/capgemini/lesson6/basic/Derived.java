package com.capgemini.lesson6.basic;

public class Derived extends Base {
   
	Derived() //Default Constructor
	{
		/*
		 * Assigning values to variables declared in Base
		 */
		var_default=10;
		var_public=20;
		var_protected=40;
	//	var_private=30; //This does not work as it is private, private members can't be inherited
		
		/*
		 * Invoking methods from the Base class
		 */
		method_default();
		method_public();
		method_protected();
		//method_private(); This does not work as it is private
	}
}
