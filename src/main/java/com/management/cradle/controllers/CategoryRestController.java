package com.management.cradle.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.cradle.dao.CategoryDAO;
import com.management.cradle.model.Category;


@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryRestController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Category> getAllCategories(){
		
		return categoryDAO.getAllCategories();
		
	}
	
	@PostMapping(value="/addcategory", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCategory(@RequestBody Category category) {
		
		System.out.println(category);
		categoryDAO.addCategory(category);
	}
	
}
