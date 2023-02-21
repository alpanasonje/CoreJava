package com.tns.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="tstudent")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rollno;
	private String name;
	private Float per;
	
	@ManyToOne()
	@JoinColumn(name="collegeid", referencedColumnName = "id")
	private College college;
	
	public Student(College college)
	{
		this.college=college;
	}
	
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	private Student() {
		super();

	}

	private Student(int rollno, String name, float per) {
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}

}
