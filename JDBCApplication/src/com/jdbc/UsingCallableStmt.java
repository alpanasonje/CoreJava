package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UsingCallableStmt {

	static Scanner sc;
	static Connection cn;
	static CallableStatement cst;
	

	public static String getName() {
		
		
		String name="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 //to load database driver
			System.out.println("Driver loaded successfully....");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","alpana@123"); //connect to database
			System.out.println("Connection established successfully....");
			sc=new Scanner(System.in);
			System.out.println("Enter the rollno  "); 
			int rollno=sc.nextInt();
			cst=cn.prepareCall("{? =  call getStudentName(?)}");
			cst.setInt(2, rollno);
			cst.registerOutParameter(1, java.sql.Types.VARCHAR);
			cst.execute();
			name=cst.getString(1);
			System.out.println(name);
			cn.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return name;
	
	}
}
