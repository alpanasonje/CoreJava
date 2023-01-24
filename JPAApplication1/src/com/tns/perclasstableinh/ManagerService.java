package com.tns.perclasstableinh;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class ManagerService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addManager(Manager s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateManager(Manager s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeManager(Manager s)
	{
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Manager getManager(int id)
	{
		Manager s=em.find(Manager.class, id);
		return s;	
	}
}
