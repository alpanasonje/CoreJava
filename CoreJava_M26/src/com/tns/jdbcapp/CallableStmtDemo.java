package com.tns.jdbcapp;

public class CallableStmtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(CallableStatementInterface.getPersonName(103));
		
		CallableStatementInterface.addPerson(121, "Saba");
		CallableStatementInterface.addPerson(122, "Sayeba");
		CallableStatementInterface.addPerson(123, "Sana");
		CallableStatementInterface.addPerson(124, "Sakshi");
		
		
		PreparedStatementInterface.showPersonDetails();
	}
	

}
