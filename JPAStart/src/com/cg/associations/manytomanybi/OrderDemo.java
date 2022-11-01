package com.cg.associations.manytomanybi;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OrderDemo {

	public static void main(String[] args) {
		try
		{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Book");
		p1.setPrice(540);
		
		Product p2=new Product();
		p2.setId(2);
		p2.setName("Pen");
		p2.setPrice(200);
		
		Orders o1=new Orders();
		o1.setId(101);
		o1.setPurchaseDate(new Date(2022,10,20));
		
		Set<Product> products =new HashSet<Product>();
		products.add(p1);
		products.add(p2);
		
		Set<Orders> orders =new HashSet<Orders>();
		orders.add(o1);
		
		o1.setProducts(products);
		p1.setOrders(orders);
		p2.setOrders(orders);
		
		
		em.persist(p1);
		em.persist(p2);
		em.persist(o1);
				
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("Order-Product details added...");
		}
		catch(Exception e)
		{
			System.out.println("error occurred..."+e);
		}
	}

}
