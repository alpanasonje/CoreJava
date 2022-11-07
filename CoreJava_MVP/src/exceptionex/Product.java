package exceptionex;

public class Product {
	private int productId;
	private int quantity;
	private float price;
	private String name;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) throws InvalidPriceException
	{
		if (price<0)
			throw new InvalidPriceException(price);			
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", quantity=" + quantity + ", price=" + price + ", name=" + name
				+ "]";
	}
	
	public Product() {
		super();
		
	}
	
	
}
