package lesson5.object;

class Employee1
{
	String ename;
	byte age;
	double salary;
	
	public Employee1(String ename, byte age, double salary) {
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	
	/* Overriding equals method
	 * to make equality on the basis of salary
	 * 
	 */
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
	Employee1 e=(Employee1) arg0;
	if(e.salary==this.salary)
		return true;
	else
		return false;
	
	}
	
	
}

public class ObjectDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1("Kiran",(byte) 35,40000);
		Employee1 e2=new Employee1("Hira",(byte)40,50000);
		Employee1 e3=new Employee1("Hiran",(byte)40,50000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println("Checking with equals method");
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e1));
		
		/*
		 * == operator always checks for object reference
		 * hence below code will print "false"
		 * multiple object can have same hashcode,
		 * but different references.
		 * operator overloading is not supported in Java
		 * can not overload == operator.
		 */
		System.out.println("Checking with == operator");
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e1);
		
		/* object.toString() method is invoked 
		 * implicitly in below code which will
		 * give string representation of the object.
		 */
		System.out.println(e1 +"\n" + e2 + "\n" + e3);
	}

}
