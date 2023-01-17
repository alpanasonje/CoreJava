package com.tns.classpertableinh;

import javax.persistence.EntityManager;

import com.tns.jpacrud.DAO;

public class ManagerService {
	private static EntityManager em;
	static
	{
		em=DAO.getEntityManager();
	}
	public static void addManager(Manager e)
	{
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Manager Record Added.....");
	}
}
