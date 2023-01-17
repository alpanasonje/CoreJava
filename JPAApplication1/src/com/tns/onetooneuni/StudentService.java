package com.tns.onetooneuni;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


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
	public static Student getStudent(int studentId)
	{
		Student s=em.find(Student.class, studentId);
		return s;	
	}
}
