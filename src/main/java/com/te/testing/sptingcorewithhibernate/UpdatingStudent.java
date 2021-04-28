package com.te.testing.sptingcorewithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springwithhibernate.EntityManagerFactoryConfig;
import com.te.springwithhibernate.Student;

public class UpdatingStudent {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              String query = "update Student set name=:id where id=:name";
		                Query issuedquery =   entitymanager.createQuery(query);
		                issuedquery.setParameter("id", "sravani");
		                issuedquery.setParameter("name", 101);
		               int count =  issuedquery.executeUpdate();
		               System.out.println("number of rows affected  is "+count);		              
		              transaction.commit();	              
	}

}
