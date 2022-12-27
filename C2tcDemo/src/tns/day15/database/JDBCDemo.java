package tns.day15.database;

public class JDBCDemo {

	public static void main(String[] args) {

		// Using Statement Interface
		/*
		 * if (StatementInterface.addEmployee(102, "Atharv", 86000,
		 * "Sr. Programmer")!=0) System.out.println("Record inserted...");
		 * 
		 * if (StatementInterface.updateEmployee(103, "Prajwal", 58000,
		 * "Soft. Developer")!=0) System.out.println("Record Updated...");
		 * 
		 * 
		 * StatementInterface.updateEmployeeName(101, "Parimal");
		 * StatementInterface.showEmp(); if (StatementInterface.deleteEmployee(102)!=0)
		 * System.out.println("Employee Record Deleted...."); else
		 * System.out.println("No Such Employee"); StatementInterface.showEmp();
		 * 
		 * if (StatementInterface.deleteEmployee(110)!=0)
		 * System.out.println("Employee Record Deleted...."); else
		 * System.out.println("No Such Employee"); StatementInterface.showEmp();
		 */

		/*
		 * if (PreparedStatementInterface.addEmployee(201, "Deepali", 78000,
		 * "Programmer") != 0) System.out.println("Record inserted...");
		 */
		/*
		 * if (PreparedStatementInterface.updateEmployee(202, "Pranjali", 65000,
		 * "Sr. Analyst") != 0) System.out.println("Record Updated...");
		 * 
		 * PreparedStatementInterface.updateEmployeeName(101, "Prajakta");
		 * PreparedStatementInterface.showEmp();
		 * 
		 * if (PreparedStatementInterface.deleteEmployee(102) != 0)
		 * System.out.println("Employee Record Deleted...."); else
		 * System.out.println("No Such Employee : 102");
		 * PreparedStatementInterface.showEmp();
		 * 
		 * if (PreparedStatementInterface.deleteEmployee(104) != 0)
		 * System.out.println("104 Employee Record Deleted...."); else
		 * System.out.println("No Such Employee : 104");
		 */
		
		//CallableInterfaceStatement.addEmployee(301, "Anita",71000,"Programmer");
		PreparedStatementInterface.showEmp();
		System.out.println(CallableInterfaceStatement.getEmployeeName(202));
		//PreparedStatementInterface.showEmp1();
	}

}
