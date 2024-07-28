package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Employee;

public class Testemployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");		
		Employee employee1 =(Employee) context.getBean("employee1"); 
		
	    System.out.println(employee1.getName());
	    System.out.println(employee1.getPhones());
	    System.out.println(employee1.getAddress());
	    System.out.println(employee1.getCoureses());


	}

}
