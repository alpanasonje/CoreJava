package com.tns.jointableinh;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr4")
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
