package com.te.testing.sptingcorewithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springwithhibernate.EntityManagerFactoryConfig;
import com.te.springwithhibernate.Student;

public class DeletingStudent {

	public static void main(String[] args) {
		

		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		           Student student =    entitymanager.find(Student.class,103);
		         entitymanager.remove(student);	
		         transaction.commit();	
		         System.out.println("sucessfully deleted");
		                            

	}

}
