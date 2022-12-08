package inheritance.hierarchicalinheritance;

public class Employee extends Person{
	private int empId;
	private float salary;
	private String dept;
	
	
	public Employee() {
		System.out.println("Employee Class Default Constructor");
	}


	public Employee(int empId, float salary, String dept) {
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public Employee(String name, String city,int empId, float salary, String dept) {
		super(name,city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Emp ID "+empId+"\tSalary "+salary+"\tDept "+dept);
	}
}
