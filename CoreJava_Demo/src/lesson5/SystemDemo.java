package lesson5;

import java.util.Date;
//Object class in java.lang is a superclass for all java classes 
public class SystemDemo {

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object about to get Garbage Collected");
	}
	
	public void methodX()
	{
		System.out.println("System properties are: ");
		System.out.println(System.getProperties());
	
		System.out.println("Current time in ms: " + System.currentTimeMillis());
		Date d=new Date(System.currentTimeMillis());
		System.out.println(d);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemDemo s1=new SystemDemo();
		s1.methodX();
		
		//anonymous object 
		new SystemDemo().methodX();
		
		//Using error stream
		System.err.append("1st");
		System.err.append("2nd");
		System.err.println("This is error stream");		
		
		/* System.exit(0);
		 * The parameter of exit should qualify 
		 * whether the execution of the program went good or bad. 
		 * It's a sort of eredity from older programming languages 
		 * where it's useful to know if something went wrong 
		 * and what went wrong.
			Exit code is
			�0 when execution went fine;
			�1, -1, whatever != 0 
			when some error occurred, you can use different values 
			for different kind of errors
			The value you pass in, is just the exit code returned by the JVM 
			to the invoking operating system. 
			Usually 0 means no error and any non-zero
			value means that something happened 
			(where "something" is application specific).
			
			IT IS A BAD HABIT TO USE SYSTEM.EXIT 
			PROGRAM SHOULD EXIT NATURALLY
		 */
			
		//System.runFinalizersOnExit(true);
		/*
		 * Above method is deprecated
		 * Instead, we can use below code
		 */
	//	s1=null; 
		System.gc(); //requesting garbage collector to run
		System.runFinalization(); //calling finalize before garbage collection
	}
}
