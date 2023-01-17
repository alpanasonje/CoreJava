package com.tns.onetooneuni.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{
	@Id
	private int addresId;
	private String street;
	private String city;
	private String state;
	private int pincode;
	
	
	public int getAddresId() {
		return addresId;
	}


	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [addresId=" + addresId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	

}
