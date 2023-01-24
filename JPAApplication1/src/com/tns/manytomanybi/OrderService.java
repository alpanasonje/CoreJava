package com.tns.manytomanybi;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class OrderService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addOrder(Order s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateOrder(Order s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeOrder(Order s)
	{
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Order getOrder(int id)
	{
		Order s=em.find(Order.class, id);
		return s;	
	}
}
