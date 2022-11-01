package com.cg.associations.onetomanybi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
@Id
private int id;
private String name;
@ManyToOne
@JoinColumn(name="dept_no")
private Department department ;
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
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
}
public Employee(int id, String name, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
