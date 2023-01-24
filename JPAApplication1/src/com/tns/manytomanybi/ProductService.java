package com.tns.manytomanybi;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class ProductService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addProduct(Product s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateProduct(Product s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeProduct(Product s)
	{
		em.getTransaction().begin();
		em.remove(s);;
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Product getProduct(int id)
	{
		Product s=em.find(Product.class, id);
		return s;	
	}
}
