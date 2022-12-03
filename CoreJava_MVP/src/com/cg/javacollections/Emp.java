package com.cg.javacollections;

import java.util.Comparator;

public class Emp {
	private int empId;
	private String empName;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}	
}

class SortByEmpId implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return e1.getEmpId()-e2.getEmpId();	
	}
}

class SortByEmpName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}
class SortByEmpSalary implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return (int)e1.getSalary()-(int)e2.getSalary();	
	}
}