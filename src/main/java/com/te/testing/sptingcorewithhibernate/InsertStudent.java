package com.te.testing.sptingcorewithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springwithhibernate.Adress;
import com.te.springwithhibernate.EntityManagerFactoryConfig;
import com.te.springwithhibernate.Student;

public class InsertStudent {

	public static void main(String[] args) {
		
		Adress adress1 = new Adress();
		adress1.setCurrentadress("allagadda");
		adress1.setPermanentadress("banglore");
		
		
		Student student1 = new Student();
		student1.setId(101);
		student1.setName("mahesh");
		student1.setStandard(10);
		student1.setAdress(adress1);
		student1.setGender("male");
		adress1.setStudent(student1);
		
		
ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              entitymanager.persist(student1);
		              entitymanager.persist(adress1);
		              transaction.commit();
		              System.out.println("sucessfully inserted the student information");
		              	   

	}

}
