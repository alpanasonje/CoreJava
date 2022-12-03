package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpDeptDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1=ac.getBean("e1",Employee.class);
		System.out.println(e1);
		
		Employee e2=ac.getBean("e2",Employee.class);
		System.out.println(e2);
		((AbstractApplicationContext) ac).close();
		

	}

}
