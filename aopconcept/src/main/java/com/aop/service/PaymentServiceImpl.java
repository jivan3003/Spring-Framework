package com.aop.service;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment(int amount) {
		
		System.out.println(amount + "Amount Debited");
		
		
		System.out.println(amount + "Amount Credited");
		
	}

}
