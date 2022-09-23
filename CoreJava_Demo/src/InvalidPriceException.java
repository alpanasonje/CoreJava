
public class InvalidPriceException extends Exception {
	
	public InvalidPriceException()
	{
		super("Invalid Price : ");
	}
	public InvalidPriceException(int price)
	{
		super("Invalid Price "+price);
	}
}
