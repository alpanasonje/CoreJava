package com.tns.onetooneuni.service;

import javax.persistence.EntityManager;

import com.tns.onetooneuni.dao.DAO;
import com.tns.onetooneuni.entities.Address;


public class AddressService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	public static void addAddress(Address p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Record added....");
	}

	public static void modifyAddress(Address p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		System.out.println("Record Modified....");
	}

	public static void deleteAddress(Address p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Record Deleted....");
	}

	public static Address getAddress(int rollNo) {
		Address p = em.find(Address.class, rollNo);
		return p;
	}
}
