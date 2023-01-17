package com.tns.onetomanybi;

import javax.persistence.EntityManager;

public class EmployeeService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	public static void addEmployee(Employee p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Record added....");
	}

	public static void modifyEmployee(Employee p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		System.out.println("Record Modified....");
	}

	public static void deleteEmployee(Employee p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Record Deleted....");
	}

	public static Employee getEmployee(int id) {
		Employee p = em.find(Employee.class, id);
		return p;
	}
}
