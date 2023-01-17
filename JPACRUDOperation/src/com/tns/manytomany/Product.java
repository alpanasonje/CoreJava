package com.tns.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product implements Serializable{
@Id
private int id;
private String name;
@ManyToMany(mappedBy="products")
private Set<Orders> orders;
}
