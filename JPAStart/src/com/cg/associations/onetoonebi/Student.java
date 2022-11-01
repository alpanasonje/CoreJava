package com.cg.associations.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Student  
{
@Id
private int studentId;
private String name;
@OneToOne
private Address
address;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
}
public Student(int studentId, String name, Address address) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}