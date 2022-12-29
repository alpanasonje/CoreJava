package com.tns.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("111")
	private int personId;
	
	@Value("Amol")
	private String personName;
	
	@Autowired
	private Address address;

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(int personId, String personName, Address address) {
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + address + "]";
	}

}
