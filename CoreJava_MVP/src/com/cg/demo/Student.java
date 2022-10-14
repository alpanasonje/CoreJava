package com.cg.demo;

import com.cg.accessspecifier.College;

public class Student {

//private, default, protected and public
	//private int rollNo;
//	int rollNo; //default - package specific
	protected int rollNo;
	private String name;
	private int sub1, sub2, sub3;
	private float per;
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public int getRollNo()
	{
		return rollNo; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public float getPer() {
		per=(sub1+sub2+sub3)/3.0f;
		return per;
	}

	
	 public Student() { super(); System.out.println("Default Constructor..."); }
	 
	public Student(int rollNo, String name, int sub1, int sub2, int sub3) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		getPer();
		System.out.println("In Parameterised Constructor...");
		
	}
	public static void main(String args[])
	{
		Student student =new Student();
		student.rollNo=10; //private member accessible
		College college =new College();
		//college.collegeName="MVP COE";
		
	}
	
}
