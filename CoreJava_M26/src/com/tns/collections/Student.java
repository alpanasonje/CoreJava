package com.tns.collections;

public class Student implements Comparable {
	private int rollNo;
	private String name;
	private float per;
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	@Override
	public int compareTo(Object o) {
			Student s= (Student) o;
			//return (int) (s.per-this.per); Desc
			//return (int) (this.per-s.per); Asc
			//return this.name.compareTo(s.name); Asc
			return s.name.compareTo(this.name); //Desc
		}
}
