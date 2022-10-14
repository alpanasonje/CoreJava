package com.cg.demo;

public class StudentExam extends Student
{
	int marks;

	public StudentExam(int marks) {
		super();
		this.marks = marks;
	}

	public StudentExam() {
		super();//calls student default constructor
		}

	public StudentExam(int rollNo, String name, int sub1, int sub2, int sub3,int marks) {
		super(rollNo, name, sub1, sub2, sub3);
		this.marks=marks;
	//	this.rollNo=rollNo; //private members can't inherited
	//	this.rollNo=rollNo; //default member allowed within same package subclass
		this.rollNo=rollNo; //protected member allowed within same package subclass
	}
	
}
