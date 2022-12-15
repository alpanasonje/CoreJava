package com.tns.jdbcapp.mvc.client;

import com.tns.jdbcapp.mvc.service.EmployeeDb;

public class Client {

	public static void main(String[] args) {
		EmployeeDb employeeDb=new EmployeeDb();
		boolean status;
		/*
		 * status=employeeDb.addEmployee(12, "Sameer", 1004); if(status==true)
		 * System.out.println("Record inserted succesfully");
		 */
		if (EmployeeDb.mergeDepartment(1004, 1001))
				System.out.println("1002 dept is merged with 1004 dept");
		else
			System.out.println("Dept not merged");
		
		
		
		
	}

}
