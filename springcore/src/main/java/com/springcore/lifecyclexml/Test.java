package com.springcore.lifecyclexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecyclexml/config.xml");
		/* use for register */
		context.registerShutdownHook();
		/* by using xml class Apple */
		Apple a1 =(Apple) context.getBean("a1");
		System.out.println(a1);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		/* by using interface class Pepsi */
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		/* by using Annotation class School*/
		School school = (School) context.getBean("school");
		System.out.println(school);

	}

}
