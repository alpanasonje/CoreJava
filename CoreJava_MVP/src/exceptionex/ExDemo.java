package exceptionex;

public class ExDemo {

	public static void main(String[] args) throws InvalidPriceException {
		Product p1=new Product();
		p1.setProductId(101);
		p1.setName("Book");
		p1.setQuantity(100);
		p1.setPrice(-560);
		System.out.println("Product Details "+p1);
	}

}
