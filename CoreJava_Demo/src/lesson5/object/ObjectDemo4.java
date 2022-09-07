package lesson5.object;

class Employee2
{
	String ename;
	byte age;
	double salary;
	
	public Employee2(String ename, byte age, double salary) {
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+ ename + "\n Salary: "+salary;
		
	}
}

public class ObjectDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2("Kiran",(byte) 35,40000);
		Employee2 e2=new Employee2("Hira",(byte)40,50000);
		Employee2 e3=new Employee2("Hiran",(byte)41,51000);
		
		/*
		 * toString() method is overriden
		 * and we are printing name and salary of objects.
		 */
		System.out.println(e1 +"\n" + e2 + "\n" + e3);

	}

}
