package com.tns.onetomanybi;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class DepartmentService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addDepartment(Department s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateDepartment(Department s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeDepartment(Department s)
	{
		em.getTransaction().begin();
		em.remove(s);;
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Department getDepartment(int id)
	{
		Department s=em.find(Department.class, id);
		return s;	
	}
}
