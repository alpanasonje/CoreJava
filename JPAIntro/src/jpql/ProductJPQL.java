package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dao.JPAUtil;
import entities.Product;

public class ProductJPQL {
	static EntityManager em;
	static
	{
		em=JPAUtil.getEntityManager();
	}
	public static List<Product> getProductsByQty(int quantity)
	{
		/*
		 * List<Product> plist; Query query = em.createQuery
		 * ("SELECT product from Product product", Product.class);
		 * plist=query.getResultList();
		 */
		
		String qStr = "SELECT product FROM Product product WHERE product.quantity >= :pqty";
		TypedQuery<Product> query = em.createQuery(qStr, Product.class);
		query.setParameter("pqty",quantity);
		return query.getResultList();
		
	}
}
