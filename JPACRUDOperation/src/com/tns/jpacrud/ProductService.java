package com.tns.jpacrud;

import javax.persistence.EntityManager;

public class ProductService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	public static void addProduct(Product p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Record added....");
	}

	public static void modifyProduct(Product p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		System.out.println("Record Modified....");
	}

	public static void deleteProduct(Product p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Record Deleted....");
	}

	public static Product getProduct(int prodId) {
		Product p = em.find(Product.class, prodId);
		return p;
	}
}
