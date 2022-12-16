package com.tns.testcases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.tns.jdbcapp.DBUtil;

public class DatabaseFunctions {
	private static Connection cn;
	private static CallableStatement cst;
	static {
		cn = DBUtil.getConnection();

	}

	public static boolean addPerson(int personId, String personName) {
		boolean status = false;
		try {
			if (personId <= 0)
				status = false;
			else {
				cst = cn.prepareCall("{call addPerson(?,?)}");
				cst.setInt(1, personId);
				cst.setString(2, personName);

				cst.execute();
				status = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
