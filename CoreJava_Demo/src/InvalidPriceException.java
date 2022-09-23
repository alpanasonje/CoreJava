//User defined exception class for invalid input for price (<=0)
public class InvalidPriceException extends Exception {
	int price;

	public InvalidPriceException() {
		super("Invalid Price : ");
	}

	public InvalidPriceException(int price) {
		super("Invalid Price " + price);
		this.price = price;
	}

	public String toString() {
		return "InvalidPriceException[" + price + "]";
	}
}
