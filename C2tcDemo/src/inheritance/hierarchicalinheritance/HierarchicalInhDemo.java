package inheritance.hierarchicalinheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.show();
		System.out.println("--------------------------------------");
		
		Person p2=new Person("Dhruv","Mumbai");
		p2.show();
		System.out.println("--------------------------------------");
		
		Employee e1=new Employee("Nikhil","Mumbai",101,67000,"Sales");
		e1.show();
		System.out.println("--------------------------------------");
		
	}

}
