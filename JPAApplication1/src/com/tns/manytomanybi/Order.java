package com.tns.manytomanybi;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="TOrder")
public class Order implements Serializable {
	@Id
	private int id;
	private Date purchaseDate;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Tproduct_orders",
	joinColumns = { @JoinColumn(name = "orderId") },
	inverseJoinColumns = { @JoinColumn(name ="productId") } )
	private Set<Product> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
	}
	
	
}
