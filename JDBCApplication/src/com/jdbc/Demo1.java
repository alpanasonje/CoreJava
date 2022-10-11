
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //to load database driver
			System.out.println("Driver loaded successfully....");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","alpana@123"); //connect to database
			System.out.println("Connection established successfully....");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
