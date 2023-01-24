package com.tns.helloworldioc;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class HelloWorldDemo {

	public static void main(String[] args) {
		/*
		 * HelloWorld h1=new HelloWorld(); h1.sayHello();
		 */
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	
				HelloWorld bean=(HelloWorld)c.getBean("hwObject1");
				bean.sayHello("Amit");
				
				HelloWorld bean1=c.getBean("hwObject",HelloWorld.class);
				bean1.sayHello("Amol");
				
				
	}

}
