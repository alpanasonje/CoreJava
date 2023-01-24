package com.tns.perclasstableinh;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class EmployeeService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addEmployee(Employee s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateEmployee(Employee s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeEmployee(Employee s)
	{
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Employee getEmployee(int id)
	{
		Employee s=em.find(Employee.class, id);
		return s;	
	}
}
