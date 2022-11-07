package exceptionex;

public class InvalidPriceException extends Exception{
	
	public InvalidPriceException()
	{
		//super();
		super("Price should be positive ");
	
	}
	public InvalidPriceException(float price)
	{
		super("Price should be positive : "+price);
		
	}
}
