package lesson6.useoffinal.finalinside;

public class Derived extends Base {

	//legal override as methodX is non final method
	public void methodX()
	{
	System.out.println("X method in derived class");	
	}
	
	/* following override is invalid as this method is
	 * declared as final in Base class.
	public void methodY()
	{
	}
	*/
	
	/*
	 * Following declaration is invalid
	 * as we can not decrease access
	 * while overriding.
	 * void methodX()
		{
		}
	 */
	
}
