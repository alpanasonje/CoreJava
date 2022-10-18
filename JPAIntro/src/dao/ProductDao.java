package dao;

import entities.Product;

public interface ProductDao {
	public Product getProductById(int id);
	public void addProduct(Product product);
	public void removeProduct(Product product);
	public void updateProduct(Product product);
	public void beginTransaction();
	public void commitTransaction();
	
}
