package com.jsp.mavenproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/jsp/mavenproject/dhanu.xml");
		Employee e1= (Employee)c1.getBean("abc");
		System.out.println(e1);
	}

}



// create a obj of ioc container --> classes/ interfaces