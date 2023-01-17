package com.tns.jpacrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf = Persistence.createEntityManagerFactory("PU");
		em = emf.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		return em;
	}
}