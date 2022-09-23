

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		String productName;
	     int price;
	     int qty;
	     int productId;
	     Product p1,p2;
	    try
	    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product 1 Details : ");
		System.out.println("Product No :");
		productId=sc.nextInt();
		System.out.println("Product Name : ");
		productName=sc.next();
		System.out.println("Quantity : ");
		qty=sc.nextInt();
		System.out.println("Price : ");
		price=sc.nextInt();
		if(price<=0)
			//System.out.println("Please enter valid price");
			throw new InvalidPriceException(price);
		else
			p1=new Product(productName, price, qty, productId);
	
		System.out.println("Enter Product 2 Details : ");
		System.out.println("Product No :");
		productId=sc.nextInt();
		System.out.println("Product Name : ");
		productName=sc.next();
		System.out.println("Quantity : ");
		qty=sc.nextInt();
		System.out.println("Price : ");
		price=sc.nextInt();
		if(price<=0)
			//System.out.println("Please enter valid price");
			throw new InvalidPriceException(price);
		else
			p2=new Product(productName, price, qty, productId);		
		System.out.println(p1);
		System.out.println(p2);
		if(p1.equals(p2))
			System.out.println("Same product");
		else
			System.out.println("Different Product");
		
				
	    }
	    catch(InvalidPriceException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Invalid Input "+e);
	    }
				
				
	}

}
