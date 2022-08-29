package com.capgemini.lesson4;

/*
 * static is illegal modifier for class.
 * hence, 
 * public static class MyClass
 * is invalid
 */
public class UsingStatic {

	/*
	 * Static is illegal modifer for Constructor
	 */
	public UsingStatic()
	{
		System.out.println("Constructor invoked");
	}
	
	// Declaring an instance variable
    int var_instance;
	
	// Declaring static variable
	static int var_static;	
	
	//Declaring non static method
	public void methodX()
	{
		var_instance=4;
		var_static=5;
	}
	/*
	 * Non static method has access to static as well as non static variables
	 */
	
	/*
	 * static and abstract can not be used together.
	 * hence 
	 * public static abstract void methodY();
 	 * is invalid
	 */
		
	//Declaring static method
	public static void main(String[] args) {
		//var_instance=4; Instance variable is not accessible directly
		var_static=5;
		UsingStatic obj1=new UsingStatic();
		obj1.var_instance=4; //Instance variable can be accessed using object reference
		System.out.println("Static :"+ var_static + "\n Non Static" + obj1.var_instance);
		
		obj1.var_instance++;
		obj1.var_static++;
		System.out.println("After incrementing with obj1 Object \n Static:"+var_static + "\n Non Static:" + obj1.var_instance);
		
		System.out.println("Creating another object....");
		UsingStatic obj2=new UsingStatic();
		obj2.var_instance++;
		obj2.var_static++;
		System.out.println("After incrementing with obj2 Object \n Static:"+var_static + "\n Non Static" + obj2.var_instance);
	}
	
	
}
