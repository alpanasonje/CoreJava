package com.cg.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee {
private String departmentName;

public String getDepartmentName() {
	return departmentName;
}

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

public Manager(int id, String name, double salary) {
	super(id, name, salary);
	// TODO Auto-generated constructor stub
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

@Override
public String toString() {
	return "Manager [departmentName=" + departmentName + "]";
}

public Manager(int id, String name, double salary, String departmentName) {
	super(id, name, salary);
	this.departmentName = departmentName;
}




}
