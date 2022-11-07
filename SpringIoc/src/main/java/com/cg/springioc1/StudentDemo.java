package com.cg.springioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		///Student s1=new Student();
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1=ac.getBean("st",Student.class);
		System.out.println(s1);
		
		s1=ac.getBean("st1",Student.class);
		System.out.println(s1);
		
		s1=ac.getBean("st2",Student.class);
		System.out.println(s1);
	}

}


	

