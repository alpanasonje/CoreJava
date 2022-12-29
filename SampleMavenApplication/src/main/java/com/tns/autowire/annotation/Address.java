package com.tns.autowire.annotation;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("Indira Nagar")
	private String street;
	
	@Value("Nashik")
	private String city;
	
	@Value("422009")
	private int pincode;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address(String stree, String city, int pincode) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
