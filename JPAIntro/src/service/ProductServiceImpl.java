package service;

import dao.ProductDao;
import dao.ProductDaoImpl;
import entities.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao;
	public ProductServiceImpl()
	{
		dao=new ProductDaoImpl();
	}
	@Override
	public Product getProductById(int id) {
		
		return dao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);
		
	}

	@Override
	public void removeProduct(Product product) {
		dao.removeProduct(product);
		
	}

	@Override
	public void updateProduct(Product product) {
	dao.updateProduct(product);
		
	}

}
