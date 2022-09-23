
public class Product {
	private String productName;
	private int price;
	private int qty;
	private int productId;

	public Product(String productName, int price, int qty, int productId) {
		super();
		this.productName = productName;
		this.price = price;
		this.qty = qty;
		this.productId = productId;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", qty=" + qty + ", productId=" + productId
				+ "]";
	}

	@Override
	public boolean equals(Object p) {
		if (this == null || p == null)
			return false;
		if (this == p)
			return true;
		Product pp = (Product) p;
		return (pp.productId == this.productId);

	}

}