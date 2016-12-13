package com.niit.crudappfrontend.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.crudappbackend.dao.PersonDAO;
import com.niit.crudappbackend.model.Person;

@Controller
public class HomeController {
	@Autowired
	PersonDAO personDAO;
	
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		List<Person> listPersons=personDAO.listPersons();
		ModelAndView model=new ModelAndView("index");
		model.addObject("person",new Person());
		model.addObject("listPersons", listPersons);
		
		
		return model;
	}


}



