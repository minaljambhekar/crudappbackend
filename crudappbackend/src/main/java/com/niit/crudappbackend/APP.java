package com.niit.crudappbackend;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.crudappbackend.config.AppContextConfig;
import com.niit.crudappbackend.dao.PersonDAO;
import com.niit.crudappbackend.model.Person;

/**
 * Hello world!
 *
 */

public class APP {
	 public static void main( String[] args )
	    {
	        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
	        
	        PersonDAO personDAO=(PersonDAO)context.getBean("personDAO");
	        /*
	        Person person=new Person();
	        person.setName("Will");
	        person.setCountry("India");
	        personDAO.addPerson(person);*/
	        
	        List<Person> persons=personDAO.listPersons();
	        for(Person person:persons)
	        {
	        	System.out.println("ID:"+person.getId());
	        	System.out.println("Name:"+person.getName());
	        	System.out.println("Country:"+person.getCountry());
	        }
	        
	    }
	}



