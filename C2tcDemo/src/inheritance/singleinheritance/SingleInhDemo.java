package inheritance.singleinheritance;

public class SingleInhDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.show();
		System.out.println("--------------------------------------");
		
		Person p2=new Person("Dhruv","Mumbai");
		p2.show();
		System.out.println("--------------------------------------");
		
		Student s1=new Student();
		s1.show();
		System.out.println("--------------------------------------");
		
		Student s2=new Student("TY",67.80f);
		s2.show();
		System.out.println("--------------------------------------");
		
		Student s3=new Student("Ankita", "Bangalore","TY",84.50f);
		s3.show();
		System.out.println("--------------------------------------");
	}

}
