package com.maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/maven/Company.xml");
		Company c= (Company) c1.getBean("abc");
		System.out.println(c);
	}

}
