package com.springcore.autowireannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {
	@Autowired
	@Qualifier("temp")
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}
	
	
	
	

}
