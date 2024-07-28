package com.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowirexml/config.xml");
		Employe employe = (Employe) context.getBean("employe");
		System.out.println(employe);

	}

}
