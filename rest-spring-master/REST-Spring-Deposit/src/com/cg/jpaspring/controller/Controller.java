package com.cg.jpaspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jpaspring.service.ICustomerService;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
public class Controller {
	
	@Autowired
	ICustomerService service;
	
	@RequestMapping(value = "/customer/deposit/{id}/balance/{balance}", headers = "Accept=application/json", method = RequestMethod.GET)
	public String deposit(@PathVariable("id")int id,@PathVariable("balance")double balance){
		
		service.deposit(id,balance);
		return "deposited";
		
	}
	
	
}
