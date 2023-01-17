package com.tns.onetooneuni.service;

import javax.persistence.EntityManager;

import com.tns.onetooneuni.dao.DAO;
import com.tns.onetooneuni.entities.Student;

public class StudentService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	public static void addStudent(Student p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Record added....");
	}

	public static void modifyStudent(Student p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		System.out.println("Record Modified....");
	}

	public static void deleteStudent(Student p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Record Deleted....");
	}

	public static Student getStudent(int rollNo) {
		Student p = em.find(Student.class, rollNo);
		return p;
	}

}
