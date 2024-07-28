package com.springcore.autowirexml;


public class Employe {
	
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
