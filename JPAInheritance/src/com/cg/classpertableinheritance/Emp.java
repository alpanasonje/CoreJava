package com.cg.classpertableinheritance;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Emp {
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
//@Column(name="Emp_name")
private String name;
private double salary;

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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Emp( String name, double salary) {
	super();
	
	this.name = name;
	this.salary = salary;
}
public Emp() {
	super();
}
}
