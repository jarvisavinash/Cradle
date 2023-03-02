package com.management.cradle.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.AllCategoriesInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
public class AllCategoriesInfoDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<AllCategoriesInfo> getAllCategoriesInfo(){
		
		try {
			
			return entityManager.createQuery("From AllCategoriesInfo", AllCategoriesInfo.class).getResultList();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
		
	}
}
