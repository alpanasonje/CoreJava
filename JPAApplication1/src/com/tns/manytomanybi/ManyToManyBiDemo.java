package com.tns.manytomanybi;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManyToManyBiDemo {

	public static void main(String[] args) {
		Order o1=null;
		Product p1=null;
		Set<Order> orders=new HashSet<Order>();
		Set<Product> products=new HashSet<Product>();
		Set<Product> products1=new HashSet<Product>();
		
		o1=new Order();
		o1.setId(10);
		o1.setPurchaseDate(new Date(2022,12,05));
		orders.add(o1);
		
		o1=new Order();
		o1.setId(20);
		o1.setPurchaseDate(new Date(2023,01,10));
		orders.add(o1);
		
		p1=new Product();
		p1.setId(101);
		p1.setName("TextBook");
		products.add(p1);
		
		p1=new Product();
		p1.setId(102);
		p1.setName("Book");
		products.add(p1);
		
		p1=new Product();
		p1.setId(103);
		p1.setName("Novel");
		products.add(p1);
		
		p1=new Product();
		p1.setId(104);
		p1.setName("Notebook");
		products1.add(p1);
		
		p1=new Product();
		p1.setId(105);
		p1.setName("NewsPaper");
		products1.add(p1);
		
		for(Order o:orders)
		{
			if (o.getId()==10)
				o.setProducts(products);
			if (o.getId()==20)
				o.setProducts(products1);
		}
		
		for(Product p:products)
			p.setOrders(orders);
		
		for(Product p:products1)
			p.setOrders(orders);
		
			
		//save into database 
		for(Order o:orders)
			OrderService.addOrder(o);
		
		for(Product p:products)
			ProductService.addProduct(p);
		
		for(Product p:products1)
			ProductService.addProduct(p);		
		

	}

}
