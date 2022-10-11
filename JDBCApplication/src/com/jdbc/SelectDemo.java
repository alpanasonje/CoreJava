package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDemo {

	public static void main(String[] args) {
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //to load database driver
			System.out.println("Driver loaded successfully....");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","alpana@123"); //connect to database
			System.out.println("Connection established successfully....");
			
			/*
			 * Statement st=cn.createStatement(); //statement created
			 * 
			 * ResultSet
			 * rs=st.executeQuery("select code,name,continent,population from country");
			 *///execute select statement
			String continent;
			System.out.println("Enter the continent : ");
			Scanner sc=new Scanner(System.in);
			continent=sc.nextLine();
			PreparedStatement pst=cn.prepareStatement("select code,name,continent,population from country where continent=?");
			pst.setString(1, continent);
			ResultSet rs=pst.executeQuery();
			System.out.println("Code\tName\t\t\tContinet\t\t\tPopulation");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4));
			}
			rs.close();
			pst.close();
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
