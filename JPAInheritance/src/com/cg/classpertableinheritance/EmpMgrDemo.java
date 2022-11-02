package com.cg.classpertableinheritance;

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
		/*
		 * Emp e1=new Emp(1,"Lisha",45000); em.persist(e1); Manager m1=new
		 * Manager(2,"Aniket",43000,"Account"); em.persist(m1);
		 */
		/*
		 * Emp ee=new Emp("Nidhi", 55000); ee.setId(5); em.persist(ee);
		 */
		
		  Manager m=new Manager("Likshit",66000,"IT"); 
		  m.setId(10);
		  em.persist(m);
		 
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
