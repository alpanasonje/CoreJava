package com.tns.jpacrud;

public class ProductDemo {

	public static void main(String[] args) {
		Product p = new Product();
		/*
		 * p.setProdId(101); p.setName("T-Shirt"); p.setPrice(800);
		 * 
		 * ProductService.addProduct(p);
		 * System.out.println("--------------------------");
		 * 
		 * //p=new Product(); p.setProdId(102); p.setName("Jeans"); p.setPrice(1000);
		 * 
		 * ProductService.addProduct(p);
		 * System.out.println("--------------------------");
		 */

		p = ProductService.getProduct(101);
		System.out.println(p);
		if (p!=null)
		{
			p.setPrice(700);
			ProductService.modifyProduct(p);
		}
		else
			System.out.println("No such product");
		
		p = ProductService.getProduct(102);
		if (p!=null)
		{
			ProductService.deleteProduct(p);
		}
		else
			System.out.println("No such product");
			
		

	}

}
