package com.capgemini.lesson6.basic;

public class Student extends Person 
{
	private int rollNo;
	private float per;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	public String toString()
	{
		//return "Student ["+super.toString()+" Roll NO : "+rollNo+"\tPercentage : "+per+"]";
		return "Student [Name : "+super.getName()+" Contact No : "+super.getContactNo()+" Roll NO : "+rollNo+"\tPercentage : "+per+"]";
	}
}
