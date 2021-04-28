package com.te.testing.sptingcorewithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springwithhibernate.EntityManagerFactoryConfig;
import com.te.springwithhibernate.Student;

public class RetrivingStudentData {

	public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              String query = " from Student";
		                Query issuedquery =   entitymanager.createQuery(query);
		         List<Student> student =    issuedquery.getResultList();
		         transaction.commit();
		         
		         for(Student st:student)
		         {
		        	 System.out.println(st.getId());
		        	 System.out.println(st.getName());
		        	 System.out.println(st.getStandard());
		        	 System.out.println(st.getGender());
		        	 System.out.println(st.getAdress().getCurrentadress());
		        	 System.out.println(st.getAdress().getPermanentadress());
		         }
		                
		                        
		              	   

	}

}
