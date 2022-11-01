package com.cg.associations.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address1")
public class Address 
{
@Id
private int addressId;
private String street;
private String city;
private String state;
private String zipcode;
@OneToOne(mappedBy="address")
private Student student;

public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
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
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int addressId, String street, String city, String state, String zipcode) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
			+ ", zipcode=" + zipcode + "]";
}

}
