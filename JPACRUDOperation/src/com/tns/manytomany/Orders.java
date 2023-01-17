package com.tns.manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Orders implements Serializable{
@Id
private int id;
private Date purchaseDate;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "product_orders",

joinColumns = { @JoinColumn(name = "order_id") },
inverseJoinColumns = { @JoinColumn(name =

"product_id") } )
private Set<Product> products = new HashSet<>();
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
	return "Orders [id=" + id + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
}


}