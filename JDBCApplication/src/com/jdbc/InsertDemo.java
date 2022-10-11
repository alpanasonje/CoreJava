package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //to load database driver
			System.out.println("Driver loaded successfully....");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","alpana@123"); //connect to database
			System.out.println("Connection established successfully....");
			
			/*
			 * Statement st=cn.createStatement(); //statement created st.
			 * executeUpdate("create table student(rollno integer primary key, sname varchar(50), per float)"
			 * ); System.out.println("Table created successfully......");
			 */
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno name and per "); 
			int rollno=sc.nextInt();
		
			String name=sc.nextLine();
			
			float per=sc.nextFloat();
			
			PreparedStatement pst=cn.
			  prepareStatement("Insert into student values(?,?,?)");
			pst.setInt(1, rollno);
			pst.setString(2, name); 
			pst.setFloat(3, per);
			
			int n=pst.executeUpdate();
			  System.out.println(n+" Record inserted successfully...");
			  
			cn.close();
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
