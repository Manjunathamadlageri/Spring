package com.maven2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/maven2/jsp.xml");
		System.out.println(c1.getBean("xyz")); // downcasting is done implicitly by the springcontainer
		System.out.println(c1.getBean("abc"));
//		Company co= (Company) c1.getBean("xyz");
	}
}
	
