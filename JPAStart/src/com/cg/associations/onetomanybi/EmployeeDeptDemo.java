package com.cg.associations.onetomanybi;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDeptDemo {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Department dept=new Department();
		dept.setId(1001);
		dept.setName("Sales");
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Priti");
		e1.setDepartment(dept);
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Neha");
		e2.setDepartment(dept);
		
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("Rushi");
		e3.setDepartment(dept);
		
		Set<Employee> emp=new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		dept.setEmployees(emp);
		
		em.persist(dept);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("Employee-Dept details added...");
		}
		catch(Exception e)
		{
			System.out.println("error occurred..."+e);
		}

	}

}
