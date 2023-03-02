package com.management.cradle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subCategories")
public class SubCategory {
	private String subCategoryId;
	private String subCategoryName;
	private String categoryId;
	
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SubCategory(String subCategoryId, String subCategoryName, String categoryId) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
	}
	
	@Id
	public String getSubCategoryId() {
		return subCategoryId;
	}
	
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	
	public String getSubCategoryName() {
		return subCategoryName;
	}
	
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + ", categoryId="
				+ categoryId + "]";
	}
	
}
