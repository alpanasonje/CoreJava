package com.tns.classpertableinh;

import javax.persistence.EntityManager;

import com.tns.jpacrud.DAO;

public class EmployeeService {
private static EntityManager em;
static
{
	em=DAO.getEntityManager();
}
public static void addEmployee(Employee e)
{
	em.getTransaction().begin();
	em.persist(e);
	em.getTransaction().commit();
	System.out.println("Employee Record Added.....");
}
}
