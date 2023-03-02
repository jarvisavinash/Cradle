package com.management.cradle.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.Counters;
import com.management.cradle.model.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

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
	
	public void registerCustomer(Customer customer) {
		
		try {
			Counters counterCustomerId = entityManager.find(Counters.class,"customer");
			Counters counterAddressId = entityManager.find(Counters.class, "customerAddress");
			
			 
			String CustomerId = counterCustomerId.getIntitialValue() + counterCustomerId.nextValue();
			String AddressId = counterAddressId.getIntitialValue() + counterAddressId.nextValue();
			
			customer.setCustomerId(CustomerId);
			customer.setFirstName(customer.getFirstName());
			customer.setLastName(customer.getLastName());
			customer.setEmailId(customer.getEmailId());
			customer.setMobileNumber(customer.getMobileNumber());
			customer.setPassword(customer.getPassword());
			customer.setAddressId(AddressId);
			
			entityManager.persist(customer);
			
		}
		catch(Exception e) {
		  throw new RuntimeException(e);	
		}
	}
}
