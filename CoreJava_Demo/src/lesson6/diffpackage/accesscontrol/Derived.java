package lesson6.diffpackage.accesscontrol;

import lesson6.diffpackage.baseclass.Base;



public class Derived extends Base {

	Derived()
	{
		/*
		 * Assigning values to variables declared in Base
		 */
		//var_default=10; This will not work as package is different
		var_public=20;
		var_protected=40;
		//var_private=30; This does not work as it is private
		
		/*
		 * Invoking methods from the Base class
		 */
		//method_default(); This will not work as package is different
		method_public();
		method_protected();
		//method_private(); This does not work as it is private
	}
	
}
