package com.cg.demo;
public class StudentDemo {

	public static void main(String[] args) {
		//Student student=new Student();
		Student student=new Student(1,"Aniket",67,76,83);
		//student.rollNo=11; private member not accessible
		//student.rollNo=11; //default member allowed within same package non subclass
		student.rollNo=11;// protected member allowed within same package non subclass
		/*
		 * student.setRollNo(1); student.setName("Aniket"); student.setSub1(67);
		 * student.setSub2(76); student.setSub3(83);
		 */
		System.out.println("RollNo : "+student.getRollNo()+" Name : "+student.getName()+" Per : "+student.getPer());
		Student student1=new Student(2,"Pooja",87,66,84);
		System.out.println("RollNo : "+student1.getRollNo()+" Name : "+student1.getName()+" Per : "+student1.getPer());
		Student student2=student;
		System.out.println("RollNo : "+student2.getRollNo()+" Name : "+student2.getName()+" Per : "+student2.getPer());
	}

}
