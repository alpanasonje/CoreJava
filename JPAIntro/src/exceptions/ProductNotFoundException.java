package exceptions;

public class ProductNotFoundException extends Exception {
public ProductNotFoundException()
{
	super();
}
@Override
public String toString()
{
	return "No such product exists..";
}
}
