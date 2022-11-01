package com.cg.associations.manytomanybi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
@Id
private int id;
private String name;
private float price;
@ManyToMany(mappedBy="products")
private Set<Orders> orders;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Set<Orders> getOrders() {
	return orders;
}
public void setOrders(Set<Orders> orders) {
	this.orders = orders;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", orders=" + orders + "]";
}
public Product(int id, String name, float price, Set<Orders> orders) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.orders = orders;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
