package com.tns.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpaentity.Book1;

public class BookDemo {

	public static void main(String[] args) {
		try
		{
		
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("PU");
		
				EntityManager em = factory.createEntityManager();
				
				em.getTransaction().begin();
				
				Book1 b1=new Book1();
				b1.setBookId(102);
				b1.setTitle("Java Complete Reference");
				b1.setAuthor("Herbert Schild");
				b1.setPrice(2000);
				
				em.persist(b1);
				em.getTransaction().commit();
				System.out.println("Book record inserted....");
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("--------------------------------------");
	}

}
