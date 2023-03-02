package com.management.cradle.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class ProductDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Product> getAllProduct(){
		
		try {
			
			return entityManager.createQuery("From Product", Product.class).getResultList();
			
		} catch(Exception e) {
			
			throw new RuntimeException(e);
		}
	}
}
