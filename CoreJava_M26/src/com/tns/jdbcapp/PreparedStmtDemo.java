package com.tns.jdbcapp;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		//display person details where person name 2nd letter is 'a' 
		PreparedStatementInterface.showPersonDetails("_a%");
		
		//display person details whose name ends with 't'
		PreparedStatementInterface.showPersonDetails("%t");
		
		PreparedStatementInterface.addPerson(112, "Prajakta");
		System.out.println("person details after adding  new record");
		PreparedStatementInterface.showPersonDetails();
		
		System.out.println("Person : "+PreparedStatementInterface.getPerson("Amit"));
		
		  System.out.println("Person details after modifying name");
		  PreparedStatementInterface.updatePersonName(104, "Kartik");
		  PreparedStatementInterface.showPersonDetails();
		 
		 
		
		System.out.println("Person details after removing person");
		PreparedStatementInterface.deletePerson(108);
		PreparedStatementInterface.showPersonDetails();
		
	}

}
