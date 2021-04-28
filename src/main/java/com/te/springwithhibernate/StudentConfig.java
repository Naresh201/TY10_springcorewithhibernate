package com.te.springwithhibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	public Student getStudent() {
		
		
		Student student1 = new Student();
		student1.setId(101);
		student1.setName("naresh");
		student1.setGender("male");
		student1.setStandard(10);
		
		return student1;
	}

}
