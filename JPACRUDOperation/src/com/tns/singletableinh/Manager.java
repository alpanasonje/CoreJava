package com.tns.singletableinh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Mgr")
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
