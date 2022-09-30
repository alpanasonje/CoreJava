package lesson2;

import java.time.LocalDate;
import java.util.Date;

public class TipsForEclipse {

	/* Task 1: to format this class use Ctrl + Shift + F key combination */

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private int employeeId;
	private String firstName;
	private String lastName;

	Date d1;

	/*
	 * Task 2: To remove the compilation error, we need to import LocalDate class
	 * you can instruct eclipse to do this task, hover the mouse on compilation
	 * error or select the hint balloon eclipse will display all available imports,
	 * select the proper import which is java.time
	 */

	
//	  Note:please remove the below comment before you proceed Use Ctrl + 7 to
//	  complete this task
	 
	private LocalDate dateOfJoin;

	/*
	 * Task 3: re-factor the above variable as salary, place the cursor in property
	 * name, right click and select re-factor -> Rename. When you refactor, eclipse
	 * will automatically update all occourances, do check the printSalary() method
	 * which also uses the salary variable
	 */

	private double salary;

	public void printSal() {

		System.out.println("Salary Rs." + salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	/*
	 * Task 4: generating getter and setters to create getter and setter for the
	 * above properties right click anywhere in editor and select Source->Generate
	 * getters and setters
	 */

}
