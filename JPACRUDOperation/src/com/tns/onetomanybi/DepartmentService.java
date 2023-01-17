package com.tns.onetomanybi;

import javax.persistence.EntityManager;

public class DepartmentService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	public static void addDepartment(Department p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Record added....");
	}

	public static void modifyDepartment(Department p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		System.out.println("Record Modified....");
	}

	public static void deleteDepartment(Department p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Record Deleted....");
	}

	public static Department getDepartment(int studId) {
		Department p = em.find(Department.class, studId);
		return p;
	}
}
