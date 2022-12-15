package com.tns.jdbcapp;

import java.nio.file.ClosedFileSystemException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	static Connection cn;

	public static void main(String[] args) {
		cn = DBUtil.getConnection();
		// Adding person records
		/*
		 * StatementInterface.addPerson(103, "Dhruv"); StatementInterface.addPerson(104,
		 * "Lavisha"); StatementInterface.addPerson(105, "Manisha");
		 */

		if (StatementInterface.addPerson(110, "Preeti") == false)
			System.err.println("Insertion operation failed...");
		else
			System.out.println("Record inserted successfully......");

		StatementInterface.showPersonDetails();
		System.out.println("-------------------------------------------");
		try {
			System.out.println("---------------FIRST RECORD ----------------------------");
			StatementInterface.first();
			System.out.println("---------------NEXT RECORD----------------------------");
			StatementInterface.next();
			System.out.println("--------------LAST RECORD-----------------------------");
			StatementInterface.last();
			System.out.println("----------------PREVIOUS RECORD---------------------------");
			StatementInterface.previous();
			System.out.println("-------------------------------------------");
			int n = StatementInterface.getPerson("Dhruv");
			if (n != 0)
			{
				System.out.println("Person id is : " + n);
				if(StatementInterface.deletePerson(n)==true)
					System.out.println("Person removed...");
			}
			else
				System.err.println("No such record...");
			
			System.out.println("-------------------------------------------");
			n=StatementInterface.getPerson("Preeti");
			if (n != 0)
			{
				System.out.println("Person id is : " + n);
				if(StatementInterface.updatePersonName(n,"Neetu")==true)
					System.out.println("Person name updated.....");
			}
			else
				System.err.println("No such record...");
			
			System.out.println("--------------LAST RECORD-----------------------------");
			StatementInterface.last();
			
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		}

	}

}
