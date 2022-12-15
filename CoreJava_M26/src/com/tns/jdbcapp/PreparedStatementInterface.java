package com.tns.jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementInterface {

	private static Connection cn;
	private static ResultSet rs;
	private static PreparedStatement pst;
	private static String query;
	static int n;
	static {
		cn = DBUtil.getConnection();

	}

	public static void showPersonDetails(String criteria) {

		try {

			pst = cn.prepareStatement("SELECT * FROM person WHERE personname like ?");
			pst.setString(1, criteria);
			rs = pst.executeQuery();
			System.out.println("Person Details as follows: ");
			System.out.println("Person Id\tPerson Name");
			while (rs.next()) {
				System.out.println(rs.getInt("personId") + "\t" + rs.getString(2));
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error...." + e.getMessage());
		}
	}

	public static void showPersonDetails() {

		try {

			pst = cn.prepareStatement("SELECT * FROM person");

			rs = pst.executeQuery();
			System.out.println("Person Details as follows: ");
			System.out.println("Person Id\tPerson Name");
			while (rs.next()) {
				System.out.println(rs.getInt("personId") + "\t" + rs.getString(2));
			}
			rs.close();
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		}
	}

	public static boolean addPerson(int personId, String personName) {
		boolean status = false;

		query = "INSERT INTO person VALUES(?,?)";
		try {
			pst = cn.prepareStatement(query);
			pst.setInt(1, personId);
			pst.setString(2, personName);
			n = pst.executeUpdate();
			if (n == 1)
				status = true;
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			status = false;
		}

		return status;
	}

	public static boolean validatePerson(int personId) {
		boolean status = false;
		query = "SELECT * FROM person where personId=?";
		try {
			pst = cn.prepareStatement(query);
			pst.setInt(1, personId);
			rs = pst.executeQuery();
			if (rs.next())
				status = true;
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			status = false;
		}
		return status;
	}

	public static int getPerson(String personName) {
		n = 0;

		try {
			pst = cn.prepareStatement("SELECT * FROM person WHERE personname = ?");

			pst.setString(1, personName);

			rs = pst.executeQuery();

			if (rs.next())
				n = rs.getInt(1);
			System.out.println("ID : " + n);
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			n = 0;
		}
		return n;
	}

	public static boolean deletePerson(int personId) {
		n = 0;
		boolean status = false;
		query = "DELETE FROM person WHERE personId=?";
		try {
			pst = cn.prepareStatement(query);
		 pst.setInt(1, personId);
			n = pst.executeUpdate();
			if (n != 0)
				status = true;
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			status = false;
		}
		return status;
	}

	public static boolean updatePersonName(int personId, String personName) {
		n = 0;
		boolean status = false;
		query = "UPDATE person SET personName=(?) WHERE personId=(?)";
		try {
			pst = cn.prepareStatement(query);

			pst.setInt(2, personId);
			pst.setString(1, personName);

			n = pst.executeUpdate();
			if (n != 0)
				status = true;
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			status = false;
		}
		return status;
	}

}
