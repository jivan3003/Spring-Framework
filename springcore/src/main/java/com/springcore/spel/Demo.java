package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	by expression
	@Value("#{22+11}")
	private int x;
	@Value("#{1+44+23}")
	private int y;
//	by using method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
//	by using variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;
//	by using object
	@Value("#{new java.lang.String('jivan karat')}")
	private String name;
	@Value("#{8>3}")
	private boolean isActive;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	

	
	
	


}
