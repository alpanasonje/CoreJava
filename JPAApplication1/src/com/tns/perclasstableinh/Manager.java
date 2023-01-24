package com.tns.perclasstableinh;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {
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
