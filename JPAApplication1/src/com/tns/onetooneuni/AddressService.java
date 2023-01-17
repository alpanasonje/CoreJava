package com.tns.onetooneuni;

import javax.persistence.EntityManager;

import com.tns.jpaintro.DAO;


public class AddressService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addAddress(Address s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateAddress(Address s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeAddress(Address s)
	{
		em.getTransaction().begin();
		em.remove(s);;
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Address getAddress(int addressId)
	{
		Address s=em.find(Address.class, addressId);
		return s;	
	}
}
