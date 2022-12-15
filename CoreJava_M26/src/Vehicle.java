package com.tnsif.dayfive.hierarchicalinheritance;

public class Vehicle {
	private String companyName;
	private int price;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Vehicle(String companyName, int price) {
		super();
		this.companyName = companyName;
		this.price = price;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [companyName=" + companyName + ", price=" + price + "]";
	}

}
