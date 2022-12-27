package tns.day15.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterface {
	static Connection cn;
	static Statement st;
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
		try {
			st = cn.createStatement();
			n = st.executeUpdate(
					"INSERT INTO employee VALUES(" + empId + ", '" + empName + "'," + salary + ",'" + post + "')");

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
		try {
			st = cn.createStatement();
			n = st.executeUpdate("UPDATE employee SET empname= '" + empName + "' , salary=" + salary + ", post='" + post
					+ "' WHERE empid=" + empId);

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
		try {
			st = cn.createStatement();
			n = st.executeUpdate("UPDATE employee SET empname= '" + empName + "' WHERE empid=" + empId);

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
		try {
			st = cn.createStatement();
			n = st.executeUpdate("UPDATE employee SET salary= " + salary + " WHERE empid=" + empId);

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
		try {
			st = cn.createStatement();
			n = st.executeUpdate("DELETE FROM employee WHERE empid=" + empId);

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

	static void showEmp()
	{
		try {
			st=cn.createStatement();
			rs=st.executeQuery("SELECT * FROM employee");
			while(rs.next())
			{
				System.out.println(rs.getInt("empid")+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
			} 
		}catch (SQLException e) {
				System.err.println("SQL Error...." + e.getMessage());
			} finally {
				try {
					rs.close();
				
					st.close();
				}
				catch (SQLException e) {
					System.err.println("SQL Error...." + e.getMessage());
				}
			}
		
	}
}
