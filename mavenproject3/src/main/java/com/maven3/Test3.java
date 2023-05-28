package com.maven3;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/maven3/standly.xml");
		Demo d1= (Demo) c1.getBean("abc");
		System.out.println(d1);
		
		List<String> s1= d1.getProjects();
		System.out.println(s1.getClass());
	}

}
