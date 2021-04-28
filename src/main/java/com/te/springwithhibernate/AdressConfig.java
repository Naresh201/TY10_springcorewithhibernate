package com.te.springwithhibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdressConfig {
	@Bean
	public Adress getAdress() {
		Adress adress1 = new Adress();
		adress1.setCurrentadress("8-7-247,allagadda");
		adress1.setCurrentadress("banglore");
		return adress1;
		
	}

}
