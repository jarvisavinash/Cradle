package com.management.cradle.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.cradle.dao.CustomerDAO;
import com.management.cradle.model.Customer;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerRestController {

	@Autowired
	CustomerDAO customerDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Customer> getAllCustomer(){
		
		return customerDAO.getAllCustomers();
	}
}
