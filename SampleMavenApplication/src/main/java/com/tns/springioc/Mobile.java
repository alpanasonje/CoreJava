package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	
	Sim s;
	s=(Jio)c.getBean("jio1");
	s.calling();
	s.data();
	
	s=(Airtel)c.getBean("airtel1");
	s.calling();
	s.data();

	}

}
