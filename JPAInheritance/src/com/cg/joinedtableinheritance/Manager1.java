package com.cg.joinedtableinheritance;

import javax.persistence.Entity;

@Entity
public class Manager1 extends Emp1 {
private String departmentName;

public String getDepartmentName() {
	return departmentName;
}

public Manager1() {
	super();
	// TODO Auto-generated constructor stub
}


public Manager1(int id,String name, double salary, String departmentName) {
	super(id,name, salary);
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
