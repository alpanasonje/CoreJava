package com.cg.di;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Employee implements InitializingBean, DisposableBean{
	private int empId;
	private String name;
	private float salary;
	
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary +department+"]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, float salary, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
	
//	@PostConstruct
	/*public void init()
	{
		System.out.println("Employee added....");
	}*/
	
//	@PreDestroy
	public void destroy()
	{
		System.out.println("Employee removed....");
	}
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Employee added....");
	}
}
//By Programmatic Approach
/* Employee implements InitializingBean, DisposableBean*/