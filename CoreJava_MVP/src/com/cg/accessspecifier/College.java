package com.cg.accessspecifier;

import com.cg.demo.Student;

public class College {
	private String collegeName;
	private String address;
	private int collegeCode;
	private Streams streams;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public College(String collegeName, String address, int collegeCode) {
		super();
		this.collegeName = collegeName;
		this.address = address;
		this.collegeCode = collegeCode;
	}
	public College() {
		super();
	}
	public static void main(String args[])
	{
		Student student =new Student();
		//student.rollNo=1;//private member can't accessible
		//student.rollNo=11;
		//default member not accessible in another package subclass//default member not accessible in another package subclass//default member not accessible in another package subclass
		//student.rollNo=11;//protected member not allowed within different package non subclass
		College cg=new College("MVP COE", "Nashik", 4029);
		cg.streams=Streams.CSE;
	}
}
