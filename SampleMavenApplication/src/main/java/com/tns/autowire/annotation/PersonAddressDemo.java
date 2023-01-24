package com.tns.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonAddressDemo {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("bean1.xml");
		Person person=c.getBean("person", Person.class);
		System.out.println(person);
		
		person=c.getBean("person1", Person.class);
		System.out.println(person);
	}

}
