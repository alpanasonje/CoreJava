package com.tnsif.generics;

public class Person implements Comparable<Person>{
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
	@Override
	public int compareTo(Person o) {
		
		return this.city.compareTo(o.city);
	}	
}

