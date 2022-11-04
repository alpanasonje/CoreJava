package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocDemo {

	public static void main(String[] args) {
		/*
		 * Airtel a1=new Airtel(); a1.calling(); a1.data();
		 * 
		 * Jio j1=new Jio(); j1.calling(); j1.data();
		 */

		/*SpringFramework - 1) create objects for our application
		 * 2) Manages objects for our application
		 * 
		 * Configuration file(beans.xml) - contains classes(beans)
		 * IOC container accesss classes present in configuration file 
		 * and Spring framework creates objects for that
		
		 *BeanFactory
		 *ApplicationContext
		 *
		 *ClassPathXmlApplicationContext 
		 *
		 */
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Airtel a1=ac.getBean("airtel1",Airtel.class);
		Jio j1=ac.getBean("jio",Jio.class);
		a1.calling();
		a1.data();
		j1.calling();
		j1.data();
	}

}
