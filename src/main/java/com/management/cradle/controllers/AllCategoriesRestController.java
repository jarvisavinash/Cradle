package com.management.cradle.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.cradle.dao.AllCategoriesInfoDAO;
import com.management.cradle.model.AllCategoriesInfo;


@RestController
@CrossOrigin
@RequestMapping("/allcategoriesinfo")
public class AllCategoriesRestController {
	@Autowired
	AllCategoriesInfoDAO allCategoriesInfoDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<AllCategoriesInfo> getAllCategoriesInfo(){
		
		return allCategoriesInfoDAO.getAllCategoriesInfo();
		
	}
}
