package com.tns.jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;

public class CallableStatementInterface {

	private static Connection cn;
	private static CallableStatement cst;
	static {
		cn = DBUtil.getConnection();

	}

	public static String getPersonName(int personId) {
		String name="";
		try {
			
			cst = cn.prepareCall("{? = call getPersonName(?)}");
			cst.setInt(2, personId);
			cst.registerOutParameter(1, java.sql.Types.VARCHAR);
			cst.execute();
			name=cst.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name ;

	}
	
	public static void addPerson(int personId, String personName)
	{
try {
			
			cst = cn.prepareCall("{call addPerson(?,?)}");
			cst.setInt(1, personId);
			cst.setString(2, personName);
			
			cst.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
