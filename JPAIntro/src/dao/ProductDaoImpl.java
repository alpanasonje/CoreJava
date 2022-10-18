package dao;

import javax.persistence.EntityManager;

import entities.Product;

public class ProductDaoImpl implements ProductDao {

	private EntityManager em;
	public ProductDaoImpl()
	{
		em=JPAUtil.getEntityManager();
	}
	@Override
	public Product getProductById(int id) {
		return em.find(Product.class, id);		
	}

	@Override
	public void addProduct(Product product) {
		beginTransaction();
		em.persist(product);
		commitTransaction();
	}

	@Override
	public void removeProduct(Product product) {
		beginTransaction();
		em.remove(product);
		commitTransaction();
	}

	@Override
	public void updateProduct(Product product) {
		beginTransaction();
		em.merge(product);
		commitTransaction();
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
