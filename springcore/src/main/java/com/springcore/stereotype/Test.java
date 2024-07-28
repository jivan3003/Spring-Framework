package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student1 = (Student) context.getBean("ob");
	    System.out.println(student1.getStudentname());
	    System.out.println(student1.getCity());
	    System.out.println(student1.getAddress());
		
	}

}
 