package com.cg.springioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=ac.getBean("st",Student.class);
		System.out.println(s1);
		
		s1=ac.getBean("st1",Student.class);
		System.out.println(s1);
	}

}


	

