package com.springcore.autowireannot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowireannot/config.xml");
		Employe employe = (Employe) context.getBean("employe");
		System.out.println(employe);

	}

}
