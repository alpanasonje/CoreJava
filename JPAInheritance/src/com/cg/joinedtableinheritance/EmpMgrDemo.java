package com.cg.joinedtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpMgrDemo {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		  Emp1 e1=new Emp1(1,"Lisha",45000); em.persist(e1);
		  Manager1 m1=new Manager1(2,"Aniket",43000,"Account"); 
		  em.persist(m1);
		 

		 
		 
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("record added.....");
		}
		catch(Exception e)
		{
			System.out.println("error occurred..."+e);
		}
	}

}
