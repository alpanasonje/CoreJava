package com.tns.classpertableinh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr3")
public class Manager extends Employee{
	private int noOfEmployees;

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return "Manager [noOfEmployees=" + noOfEmployees + "]";
	}
	
	

}
