package com.capgemini.lesson6.basic;

public class StudPersonDemo {
	StudPersonDemo() {
		System.out.println("Constructor.....");
	}

	StudPersonDemo(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Sonali");
		p1.setContactNo("9834543355");

		Student s1 = new Student();
		s1.setName("Pratima");
		s1.setContactNo("9334241234");
		s1.setRollNo(10);
		s1.setPer(65.50f);

		System.out.println(p1);
		System.out.println(s1.getName() + ", " + s1.getContactNo() + ", " + s1.getPer() + ", " + s1.getRollNo());
		// System.out.println(s1);

	}

}
