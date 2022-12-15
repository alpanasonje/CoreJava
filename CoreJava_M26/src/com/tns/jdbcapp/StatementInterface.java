package com.tns.jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterface {

	private static Connection cn;
	private static ResultSet rs, rs1;
	private static Statement st, st1;
	private static String query;
	static int n;
	static {
		cn = DBUtil.getConnection();
		try {
			// create readonly and forward only resultset
			st = cn.createStatement();

			// creates scrollable and updatable resultset
			st1 = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			rs1 = st1.executeQuery("SELECT * FROM person");
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		}
	}

	public static void next() throws SQLException {
		rs1.next();
		System.out.println(rs1.getInt("personId") + "\t" + rs1.getString(2));
	}

	public static void previous() throws SQLException {
		rs1.previous();
		System.out.println(rs1.getInt("personId") + "\t" + rs1.getString(2));
	}

	public static void last() throws SQLException {
		rs1.last();
		System.out.println(rs1.getInt("personId") + "\t" + rs1.getString(2));
	}

	public static void first() throws SQLException {
		rs1.first();
		System.out.println(rs1.getInt("personId") + "\t" + rs1.getString(2));
	}

	public static void showPersonDetails() {
		try {

			// query="SELECT * FROM person ORDER BY personname desc";
			query = "SELECT * FROM person";
			rs = st.executeQuery(query);
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

		query = "INSERT INTO person VALUES(" + personId + ",'" + personName + "')";
		try {
			n = st.executeUpdate(query);
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
		query = "SELECT * FROM person where personId=" + personId;
		try {
			rs = st.executeQuery(query);
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
		query = "SELECT personId FROM person where personName ='" + personName + "'";
		try {
			rs = st.executeQuery(query);
			if (rs.next())
				n = rs.getInt(1);
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			n = 0;
		}
		return n;
	}

	public static boolean deletePerson(int personId) {
		n = 0;
		boolean status = false;
		query = "DELETE FROM person where personId=" + personId;
		try {
			n = st.executeUpdate(query);
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
		query = "UPDATE person  SET personname = '" + personName + "' where personId=" + personId;
		try {
			n = st.executeUpdate(query);
			if (n != 0)
				status = true;
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
			status = false;
		}
		return status;
	}

}
