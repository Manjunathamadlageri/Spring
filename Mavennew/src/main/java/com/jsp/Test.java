package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("com/jsp/Company.xml");
		System.out.println(c.getBean("abv"));
	}

}
