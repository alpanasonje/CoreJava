package com.tns.onetomanybi;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDepartmentDemo {

	public static void main(String[] args) {
		Department dept=new Department();
		dept.setId(101);
		dept.setName("IT");
		
		Set<Employee> employees=new HashSet<Employee>();
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Amit");
		e1.setDepartment(dept);
		employees.add(e1);
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Amol");
		e2.setDepartment(dept);
		employees.add(e2);
		
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("Abhijeet");
		e3.setDepartment(dept);
		employees.add(e3);
		
		dept.setEmployees(employees);
		DepartmentService.addDepartment(dept);
		EmployeeService.addEmployee(e1);
		EmployeeService.addEmployee(e2);
		EmployeeService.addEmployee(e3);

	}

}
