package lesson5.object;

class Employee
{
	String ename;
	byte age;
	double salary;
	
	public Employee(String ename, byte age, double salary) {
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
}

public class ObjectDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Kiran",(byte) 35,40000);
		Employee e2=new Employee("Hira",(byte)40,50000);
		Employee e3=new Employee("Hira",(byte)40,50000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println("Checking with equals method");
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e1));
		/*
		 * Output for above 3 lines is false
		 * because default equals method check objects for
		 * their hashcode values
		 */
		
		System.out.println("assigning e2 to e1 reference");
		e1=e2;
		System.out.println("... and checking hashcodes for e1 and e2");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}
