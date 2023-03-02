package com.management.cradle.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.management.cradle.model.SubCategory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class SubCategoryDAO {


	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<SubCategory> getAllSubCategories(){
		
		try {
			
			return entityManager.createQuery("From SubCategory", SubCategory.class).getResultList();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
		
	}
	
	@Transactional
	public void addSubCategory(SubCategory subCategory){
		try {
			entityManager.persist(subCategory);
		}
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
}
