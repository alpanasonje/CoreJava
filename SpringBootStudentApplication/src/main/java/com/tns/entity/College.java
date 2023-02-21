package com.tns.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	private int id;
	@Column(name="collgename")
	private String collgeName;
	
	@OneToMany(mappedBy = "college")
	private Set<Student> students;
	
	public College(Set<Student> students)
	{
		this.students=students;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollgeName() {
		return collgeName;
	}
	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}
	
}
