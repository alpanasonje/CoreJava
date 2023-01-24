package com.tns.perclasstableinh;

public class TablePerClassInheritanceDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("Pankaj");
		e1.setSalary(45000);
		e1.setDepartmentName("Account");		
		EmployeeService.addEmployee(e1);
		
		e1=new Employee();
		e1.setId(1002);
		e1.setName("Pankaja");
		e1.setSalary(51000);
		e1.setDepartmentName("Sales");		
		EmployeeService.addEmployee(e1);
		
		e1=new Employee();
		e1.setId(1003);
		e1.setName("Pratik");
		e1.setSalary(76000);
		e1.setDepartmentName("IT");		
		EmployeeService.addEmployee(e1);
		
		e1=new Employee();
		e1.setId(1004);
		e1.setName("Pratiksha");
		e1.setSalary(87000);
		e1.setDepartmentName("IT");		
		EmployeeService.addEmployee(e1);
		
		Manager m1=new Manager();
		m1.setId(101);
		m1.setName("Neha");
		m1.setSalary(100000);
		m1.setDepartmentName("IT");	
		m1.setNoOfEmployees(15);
		ManagerService.addManager(m1);
		
		m1=new Manager();
		m1.setId(102);
		m1.setName("Nikhil");
		m1.setSalary(80000);
		m1.setDepartmentName("Account");
		m1.setNoOfEmployees(5);
		ManagerService.addManager(m1);
	}

}
