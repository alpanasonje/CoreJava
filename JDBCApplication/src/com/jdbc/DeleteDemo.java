package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //to load database driver
			System.out.println("Driver loaded successfully....");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","alpana@123"); //connect to database
			System.out.println("Connection established successfully....");
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the rollno "); 
			int rollno=sc.nextInt();
		
			
			
			PreparedStatement pst=cn.
			  prepareStatement("delete from student where rollno = ?");
			pst.setInt(1, rollno);
		
			
			int n=pst.executeUpdate();
			  System.out.println(n+" Record removed successfully...");
			  
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
