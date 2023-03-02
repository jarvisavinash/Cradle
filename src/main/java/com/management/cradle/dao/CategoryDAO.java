package com.management.cradle.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.Category;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
public class CategoryDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<Category> getAllCategories(){
		
		try {
			
			return entityManager.createQuery("From Category", Category.class).getResultList();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
		
	}
	
	@Transactional
	public void addCategory(Category category){
		try {
			entityManager.persist(category);
		}
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
}
