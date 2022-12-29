package com.tns.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDeptDemo {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=c.getBean("emp", Employee.class);
		System.out.println(e1);
		
		e1=c.getBean("emp1", Employee.class);
		System.out.println(e1);
		
		e1=c.getBean("emp2", Employee.class);
		System.out.println(e1);
		
	}
}