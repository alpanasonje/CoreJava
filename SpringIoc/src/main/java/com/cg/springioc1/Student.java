package com.cg.springioc1;

import java.util.ArrayList;

public class Student {
	private int rollNo;
	private String name;
	ArrayList<String> certificates;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, ArrayList<String> certificates) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.certificates = certificates;
	}

	public ArrayList<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(ArrayList<String> certificates) {
		this.certificates = certificates;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", certificates=" + certificates + "]";
	}

}
