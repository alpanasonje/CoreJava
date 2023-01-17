package com.tns.jpaintro;

import javax.persistence.EntityManager;

public class StudentService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addStudent(Student s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateStudent(Student s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeStudent(Student s)
	{
		em.getTransaction().begin();
		em.remove(s);;
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Student getStudent(int rollNo)
	{
		Student s=em.find(Student.class, rollNo);
		return s;	
	}
}
