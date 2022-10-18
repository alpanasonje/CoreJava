package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		System.out.println("Ok");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Greet greet = new Greet();
		greet.setMessage("Hibernate framework");

		em.persist(greet);// inserted into db table

		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();

	}
}