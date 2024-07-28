package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanscope/beanconfig.xml");
		Student student1 = (Student) context.getBean("student");
		System.out.println(student1.hashCode());
		Student student2 = (Student) context.getBean("student");
		System.out.println(student2.hashCode());
		
		Teacher teacher1 = (Teacher) context.getBean("teacher");
		System.out.println(teacher1);
		System.out.println(teacher1.hashCode());
		
		Teacher teacher2 = (Teacher) context.getBean("teacher");
		System.out.println(teacher2);
		System.out.println(teacher2.hashCode());
		
	}

}
 