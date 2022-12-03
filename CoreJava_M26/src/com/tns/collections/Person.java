package com.tns.collections;

import java.util.Comparator;

public class Person {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}	
}

class SortByName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		return p1.getName().compareTo(p2.getName());
	}	
}

class SortByCity implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		return p1.getCity().compareTo(p2.getCity());
	}	
}