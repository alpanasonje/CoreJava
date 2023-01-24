package com.tns.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tns.jpaintro.DAO;


public class EmployeeService {
	private static EntityManager em;

	static {
		em = DAO.getEntityManager();
	}

	public static void addEmployee1(Employee1 s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateEmployee1(Employee1 s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeEmployee1(Employee1 s)
	{
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Employee1 getEmployee1(int id)
	{
		Employee1 s=em.find(Employee1.class, id);
		return s;	
	}
	
	//list all the Employee1s working on given department
	public static List<Employee1> getAllEmployeesByDept(String departmentname)
	{
		List<Employee1> empList=null;
		String qstr="SELECT e FROM Employee1 e WHERE departmentName='"+departmentname+"'";
		TypedQuery<Employee1> query=em.createQuery(qstr,Employee1.class);
		empList=query.getResultList();
		return empList;
	}
	
	//list all the Employee1s working on given department
		public static List<Employee1> getAllEmployeesWithinSalaryRange(double s1, double s2)
		{
			List<Employee1> empList=null;
			String qstr="SELECT e FROM Employee1 e WHERE e.salary BETWEEN :start AND :end";
			TypedQuery<Employee1> query=em.createQuery(qstr,Employee1.class);
			query.setParameter("start",s1);
			query.setParameter("end",s2);
			empList=query.getResultList();
			return empList;
		}
		
		//list all employess
		public static List<Employee1> getAllEmployees()
		{
			List<Employee1> empList=null;
			TypedQuery<Employee1> query=em.createNamedQuery("getAllEmployees",Employee1.class);
			empList=query.getResultList();
			return empList;
		}
}
