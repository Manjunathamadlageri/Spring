package com.ty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("NewFile.xml");
		System.out.println(c.getBean("manju"));
	}
}
