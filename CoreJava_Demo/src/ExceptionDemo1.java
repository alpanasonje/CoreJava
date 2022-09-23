
//Userdefined Exception Demo
import java.util.Scanner;
public class ExceptionDemo1 {
	//using throws 
	public static Product getProduct(String productName, int price, int qty, int productId) throws InvalidPriceException
	{
		if (price <= 0)
			throw new InvalidPriceException(price);
		else
			return new Product(productName, price, qty, productId);
	}
	//handling exceptions
	public static void main(String[] args) {
		String productName;
		int price;
		int qty;
		int productId;
		Product p1, p2;
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Product 1 Details : ");
			System.out.println("Product No :");
			productId = sc.nextInt();
			System.out.println("Product Name : ");
			productName = sc.next();
			System.out.println("Quantity : ");
			qty = sc.nextInt();
			System.out.println("Price : ");
			price = sc.nextInt();
			
			p1=getProduct(productName, price, qty, productId); //may generate exception
			
			System.out.println("Enter Product 2 Details : ");
			System.out.println("Product No :");
			productId = sc.nextInt();
			System.out.println("Product Name : ");
			productName = sc.next();
			System.out.println("Quantity : ");
			qty = sc.nextInt();
			System.out.println("Price : ");
			price = sc.nextInt();
		
			p2=getProduct(productName, price, qty, productId);
			
			System.out.println(p1);
			System.out.println(p2);
			if (p1.equals(p2))
				System.out.println("Same product");
			else
				System.out.println("Different Product");

		} catch (InvalidPriceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid Input " + e);
		}

	}

}
