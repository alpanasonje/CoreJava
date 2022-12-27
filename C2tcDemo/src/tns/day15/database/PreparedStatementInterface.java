package tns.day15.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementInterface {
	static Connection cn;
	static PreparedStatement st;
	static ResultSet rs;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully....");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "alpana@123");
			System.out.println("Connection established");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("SQL Error : " + e.getMessage());
		}
	}

	static int addEmployee(int empId, String empName, float salary, String post) {
		int n = 0;
		String query;
		try {
			query = "INSERT INTO employee VALUES(?,?,?,?)";
			st = cn.prepareStatement(query);
			st.setInt(1, empId);
			st.setString(2, empName);
			st.setFloat(3, salary);
			st.setString(4, post);
			n = st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

		return n;
	}

	static int updateEmployee(int empId, String empName, float salary, String post) {
		int n = 0;
		String query = "UPDATE employee SET empname= ? , salary=?, post=? WHERE empid=?";

		try {
			st = cn.prepareStatement(query);
			st.setInt(4, empId);
			st.setString(1, empName);
			st.setFloat(2, salary);
			st.setString(3, post);

			n = st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

		return n;
	}

	static int updateEmployeeName(int empId, String empName) {
		int n = 0;
		String query = "UPDATE employee SET empname= ? WHERE empid=?";
		try {
			st = cn.prepareStatement(query);
			st.setInt(2, empId);
			st.setString(1, empName);
			n = st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

		return n;
	}

	static int updateEmployeeSalary(int empId, float salary) {
		int n = 0;
		String query = "UPDATE employee SET salary= ? WHERE empid=?";
		try {
			st = cn.prepareStatement(query);
			st.setInt(2, empId);
			st.setFloat(1, salary);
			n = st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

		return n;
	}

	static int deleteEmployee(int empId) {
		int n = 0;
		String query = "DELETE FROM employee WHERE empid=?";
		try {
			st = cn.prepareStatement(query);
			st.setInt(1, empId);
			n = st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

		return n;
	}

	static void showEmp() {
		String query = "SELECT * FROM employee ORDER BY empname";
		try {
			st = cn.prepareStatement(query);
			rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getInt("empid") + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			System.out.println("---------------------------------------------");
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				rs.close();

				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}

	}
	static void showEmp1() {
		String query = "SELECT empid, empname, salary,post FROM employee WHERE post LIKE 'Sr.%' ORDER BY empname";
		try {
			st = cn.prepareStatement(query);
			rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getInt("empid") + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			System.out.println("---------------------------------------------");
		} catch (SQLException e) {
			System.err.println("SQL Error...." + e.getMessage());
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			}
		}
	}

}
