package com.tns.onetooneuni.driver;

import com.tns.onetooneuni.entities.Address;
import com.tns.onetooneuni.entities.Student;
import com.tns.onetooneuni.service.AddressService;
import com.tns.onetooneuni.service.StudentService;

public class OneToOneAssDemo {

	public static void main(String[] args) {
		
		Address a1=new Address();
		a1.setAddresId(1);
		a1.setStreet("Indiranagar");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		a1.setPincode(422009);
		AddressService.addAddress(a1);
		
		Student s1=new Student();
		s1.setRollNo(101);
		s1.setName("Samidha");
		s1.setAddress(a1);
		StudentService.addStudent(s1);

	}

}
