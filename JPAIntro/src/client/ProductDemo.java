package client;

import java.util.List;
import java.util.Scanner;

import entities.Product;
import exceptions.ProductNotFoundException;
import jpql.ProductJPQL;
import service.ProductService;
import service.ProductServiceImpl;

public class ProductDemo {

	public static void main(String[] args) {
		ProductService service=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		try
		{
			int productId;
			String productName;
			int quantity;
			float rate;
			Product p,p1;
			List<Product> plist;
			int ch;
			do
			{
				System.out.println("--------------------Product Menu----------");
				System.out.println("1. Insert Product..");
				System.out.println("2. Update Product..");
				System.out.println("3. Remove Product..");
				System.out.println("4. Find Product..");
				System.out.println("5. Find Product by quantity");
				System.out.println("6. Exit");
				System.out.println("Enter your choice....");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter Product Id, name , quantity and rate..");
					productId=sc.nextInt();
					
					quantity=sc.nextInt();
					rate=sc.nextFloat();
					productName=sc.next();
					p=new Product();
					p.setProductId(productId);
					p.setProductName(productName);
					p.setQuantity(quantity);
					p.setRate(rate);
					service.addProduct(p);
					System.out.println("Product Inserted Successfully.....");
					break;
				case 2:
					System.out.println("Enter product Id and updated rate ");
					productId=sc.nextInt();
					rate=sc.nextFloat();
					 p1=service.getProductById(productId);
					if (p1==null)
					{
						throw new ProductNotFoundException();
					}
					else
					{
						p1.setRate(rate);
						service.updateProduct(p1);
						System.out.println("Product modified....");
					}
					break;
				case 3:
					System.out.println("Enter product Id  ");
					productId=sc.nextInt();
					
					 p1=service.getProductById(productId);
					if (p1==null)
					{
						throw new ProductNotFoundException();
					}
					else
					{
						
						service.removeProduct(p1);
						System.out.println("Product removed....");
					}
					break;
				case 4:
					System.out.println("Enter product Id ");
					productId=sc.nextInt();
					
					p1=service.getProductById(productId);
					if (p1==null)
					{
						throw new ProductNotFoundException();
					}
					else
					{
						System.out.println("Product is "+p1);
					}
					break;
				case 5:
					System.out.println("Enter Quantity...");
					quantity=sc.nextInt();
					plist=ProductJPQL.getProductsByQty(quantity);
					for(Product pr:plist)
						System.out.println(pr);
					break;
				case 6:System.exit(0);
				}
				
			}while(ch!=6);
		}
		catch(Exception e)
		{
			System.out.println("Error....."+e.getMessage());
		}
	}
}
