package com.cg.classpertableinheritance;

import javax.persistence.Entity;

@Entity
public class Manager extends Emp {
private String departmentName;

public String getDepartmentName() {
	return departmentName;
}

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}


public Manager(String name, double salary, String departmentName) {
	super(name, salary);
	this.departmentName = departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

@Override
public String toString() {
	return "Manager [departmentName=" + departmentName + "]";
}


}
