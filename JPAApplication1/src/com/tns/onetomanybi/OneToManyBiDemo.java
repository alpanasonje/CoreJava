package com.tns.onetomanybi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OneToManyBiDemo {

	public static void main(String[] args) {
		Department dept=null;
		Employee emp=null;
		
		dept=new Department();
		dept.setId(10);
		dept.setName("IT");
		
		
		Set<Employee> e =new HashSet<Employee>();
		emp=new Employee();
		emp.setId(501);
		emp.setName("Nikita");
		emp.setDepartment(dept);
		e.add(emp);
		
		emp=new Employee();
		emp.setId(502);
		emp.setName("Ankita");
		emp.setDepartment(dept);
		e.add(emp);
		
		dept.setEmployees(e);
		
		//save into database 
		DepartmentService.addDepartment(dept);
		
		for(Employee emp1:e)
			EmployeeService.addEmployee(emp1);
		
				
		

	}

}
