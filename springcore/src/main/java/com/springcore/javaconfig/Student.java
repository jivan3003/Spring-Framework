package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
		this.samosa.Display();
	}
	
	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void read() {
		System.out.println("student is reading book");
	}

}
