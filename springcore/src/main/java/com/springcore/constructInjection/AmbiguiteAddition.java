package com.springcore.constructInjection;

public class AmbiguiteAddition {
	private int a;
	private int b;

	public AmbiguiteAddition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("COnstructor : double , double");
	}

	public AmbiguiteAddition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("COnstructor : int , int");
	}

	public AmbiguiteAddition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("COnstructor : String , String");
	}

	public void doSum() {

		System.out.println("The value of a  is " + this.a);
		System.out.println("The value of a  is " + this.b);

		System.out.println("the of const id " + (this.a + this.b));
	}

}
