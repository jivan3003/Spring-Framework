package com.springcore.constructInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testconstructor {
	public static void main(String[]args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/constructInjection/consconfig.xml");
		Person p =(Person) context.getBean("person");
		System.out.println(p);
		AmbiguiteAddition a =(AmbiguiteAddition) context.getBean("add");
		a.doSum();

		
		
		
		
	}

}
