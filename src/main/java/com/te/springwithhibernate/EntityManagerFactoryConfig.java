package com.te.springwithhibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class EntityManagerFactoryConfig {
	
	@Bean
	public EntityManagerFactory getEntity()
	{
	 return Persistence.createEntityManagerFactory("entity");
	}

}
