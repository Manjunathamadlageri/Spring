package com.jsp;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("NewFile.xml");
		Company c= ( Company) c1.getBean("company");
		System.out.println(c);
		Map<Integer,String> m1=c.getEmpidandempname();
		System.out.println(m1.getClass());
	}
}
