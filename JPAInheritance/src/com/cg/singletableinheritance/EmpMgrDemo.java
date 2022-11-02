package com.cg.singletableinheritance;

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
		Employee e1=new Employee(20,"Prajakta",60000);
		em.persist(e1);
		Manager m1=new Manager(21,"Mangesh",71000,"Purchase");
		em.persist(m1);
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("Manager record added.....");
		}
		catch(Exception e)
		{
			System.out.println("error occurred..."+e);
		}
	}

}
