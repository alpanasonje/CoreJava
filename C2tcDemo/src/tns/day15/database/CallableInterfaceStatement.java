package tns.day15.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableInterfaceStatement {
	
		static Connection cn;
		static CallableStatement cst;
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
		
		public static String getEmployeeName(int empId) {
			String name="";
			try {
				
				cst = cn.prepareCall("{? = call getEmpName(?)}");
				cst.setInt(2, empId);
				cst.registerOutParameter(1, java.sql.Types.VARCHAR);
				cst.execute();
				name=cst.getString(1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return name ;

		}
		public static void addEmployee(int empId, String empName, float salary, String post)
		{
			try {
				cst = cn.prepareCall("{call addEmployee(?,?,?,?)}");
				cst.setInt(1, empId);
				cst.setString(2, empName);
				cst.setFloat(3, salary);
				cst.setString(4, post);
				cst.execute();
			} catch (SQLException e) {
				System.err.println("SQL Error...."+e.getMessage());
			}
			
			
			
		}

}
