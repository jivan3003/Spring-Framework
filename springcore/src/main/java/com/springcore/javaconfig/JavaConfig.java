package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.springcore.javaconfig" ) this is exceptional when we use @Component then only use this annotation
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
		
	}

}
