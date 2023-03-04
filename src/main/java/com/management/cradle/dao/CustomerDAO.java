package com.management.cradle.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.Counters;
import com.management.cradle.model.Customer;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Customer> getAllCustomers(){
		
		try {
			
			return entityManager.createQuery("From Customer", Customer.class).getResultList();
			
		} catch(Exception e) {
			
			throw new RuntimeException(e);
		}	
	}
	
	@Transactional
	public void registerCustomer(Customer customer) {
		
		try {
			Counters counterCustomerId = entityManager.find(Counters.class,"customer");
			Counters counterAddressId = entityManager.find(Counters.class, "customerAddress");
			
			 
			String CustomerId = counterCustomerId.getInitialValue() + counterCustomerId.nextValue();
			String AddressId = counterAddressId.getInitialValue() + counterAddressId.nextValue();
			
			customer.setCustomerId(CustomerId);
			customer.setFirstName(customer.getFirstName());
			customer.setLastName(customer.getLastName());
			customer.setEmailId(customer.getEmailId());
			customer.setMobileNo(customer.getMobileNo());
			customer.setPassword(customer.getPassword());
			customer.setAddressId(AddressId);
			
			entityManager.persist(customer);
			
		}
		catch(Exception e) {
		  throw new RuntimeException(e);	
		}
	}
	
	public Collection<Customer> loginCustomer(Customer cust)
	{ 
		 
		 try {
			 
			 TypedQuery<Customer> query = entityManager.createQuery("SELECT x FROM Customer x  WHERE x.emailId = :mail AND x.password = :pass", Customer.class);

			 
			 String mail =  cust.getEmailId();
			 String password = cust.getPassword();
			 
			 
			List<Customer> customer =  query
					.setParameter("mail" , mail)
					.setParameter("pass", password)
					.getResultList();

			
			System.out.println(customer);	 
			
			return customer;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		 
	}
	
}
