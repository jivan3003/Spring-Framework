package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")  //used for advice where we want to write this aspect
	public void printBefore() {
		
		System.out.println("Payement Started");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")  //used for advice where we want to write this aspect
	public void printAfter() {
		
		System.out.println("Payement Done");
	}

}
