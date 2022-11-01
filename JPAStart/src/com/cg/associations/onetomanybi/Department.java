package com.cg.associations.onetomanybi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department  {
@Id
private int id;
private String name;
@OneToMany(mappedBy="department")
private Set<Employee> employees;
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
public Set<Employee> getEmployees() {
	return employees;
}
public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}
public Department(int id, String name, Set<Employee> employees) {
	super();
	this.id = id;
	this.name = name;
	this.employees = employees;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
}


}
