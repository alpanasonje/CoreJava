package com.tns.classpertableinh;

public class ClasPerTableInhDemo {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("Pratik");
		e1.setSalary(56700);
		e1.setDeptName("IT");
		EmployeeService.addEmployee(e1);
		
		Manager m1=new Manager();
		m1.setId(5001);
		m1.setName("Pratiksha");
		m1.setSalary(86700);
		m1.setDeptName("IT");
		m1.setNoOfEmployees(12);
		ManagerService.addManager(m1);
		
		
	}
}
