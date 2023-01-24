package com.tns.personioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Person p=c.getBean("p1", Person.class);
		System.out.println(p);
		
		p=c.getBean("p2",Person.class);
		System.out.println(p);
	}

}
