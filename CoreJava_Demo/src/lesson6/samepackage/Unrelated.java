package lesson6.samepackage;

public class Unrelated {

	Unrelated()
	{
		/*
		 * Assigning values to variables declared in Base
		 */
		//var_default=10; not accessible directly
		//var_public=20; not accessible directly
		//var_protected=40; not accessible directly
		//var_private=30; This does not work as it is private
		
		/*
		 * Invoking methods from the Base class
		 */
		//method_default(); //not accessible directly
		//method_public(); //not accessible directly
		//method_protected(); //not accessible directly
		//method_private(); This does not work as it is private

		/* Access by using object of class 'Base' */
		/* Accessing variables */
		Base obj=new Base();
		obj.var_default=10;
		obj.var_protected=20;
		obj.var_public=30;
		//obj.var_private=40; This will not work
	
		obj.method_default(); 
		obj.method_public(); 
		obj.method_protected(); 
		//obj.method_private(); This does not work as it is private
	}
}
