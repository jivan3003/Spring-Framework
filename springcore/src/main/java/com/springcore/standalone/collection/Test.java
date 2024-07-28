package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
		System.out.println("======================");
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("======================");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		System.out.println("======================");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());

	}

}
