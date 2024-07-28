package com.springjdbc.entites;

public class Student {
//	instance variable
	private int id;
	private String name;
	private String city;
//	Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	Parameterized Constructor
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
//	Getter setter method to get the data
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
//	ToString Method 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public int update(String query, int i, String string, String string2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
