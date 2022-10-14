package com.cg.accessspecifier;

import com.cg.demo.Student;

public class StudentDetails extends Student
{
	String city;
	String contactNo;
	public StudentDetails(String city, String contactNo) {
		super();
		this.city = city;
		this.contactNo = contactNo;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(int rollNo, String name, int sub1, int sub2, int sub3,String city, String contactNo) {
		//this(city,contactNo);
		super(rollNo, name, sub1, sub2, sub3);
		this.city=city;
		this.contactNo=contactNo;
		//super.rollNo; private members can't inherited
		//super.rollNo; //default member not accessible in another package subclass
		super.rollNo=11;//protected member allowed within different package subclass
	}
	
}
