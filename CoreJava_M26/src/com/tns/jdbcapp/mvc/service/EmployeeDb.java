package com.tns.jdbcapp.mvc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tns.jdbcapp.mvc.dao.DBUtil;

public class EmployeeDb {
	private static Connection cn;
	private static ResultSet rs;
	private static PreparedStatement pst;
	private static String query;
	static int n;
	static {
		cn = DBUtil.getConnection();
	}

	public static boolean validateDept(int deptno) {
		boolean status = false;
		try {
			pst = cn.prepareStatement("SELECT count(id) FROM department WHERE id=?");
			pst.setInt(1, deptno);
			rs = pst.executeQuery();
			if (rs.next()) {
				if (rs.getInt(1) != 0)
					status = true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return status;

	}

	public static boolean addEmployee(int id, String name, int deptno) {
		boolean status = false;
		try {
			if (validateDept(deptno)) {
				pst = cn.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setInt(3, deptno);
				pst.executeUpdate();
				status = true;
			} else {
				System.out.println("Employee not added as deptno is invalid");
				status = false;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return status;
	}

	public static boolean mergeDepartment(int deptno, int todeptno) {
		boolean status = false;
		if (validateDept(deptno) && validateDept(todeptno)) {
			try {
				cn.setAutoCommit(false);
				pst = cn.prepareStatement("UPDATE employee SET dept_no=? where dept_no=?");
				pst.setInt(1, todeptno);
				pst.setInt(2, deptno);
				pst.executeUpdate();
				System.out.println("---------------------------");
				
				PreparedStatement pst1 = cn.prepareStatement("DELETE FROM department WHERE id=?");
				pst1.setInt(1, deptno);
				pst1.executeUpdate();
				System.out.println("*************");
				
				cn.commit();
				status = true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				  try {  cn.rollback();
				  
				  } catch (SQLException e1) { System.err.println(e.getMessage()); status=false;
				  }
				 
			}

		}
		else
			status=false;

		return status;
	}

}
