package com.management.cradle.model;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name="products")
@SecondaryTable(name = "productInfo", pkJoinColumns = @jakarta.persistence.PrimaryKeyJoinColumn(name = "productId"))
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private String id;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "subCategoryId")
	private String subCategoryId;
	
	@Column(name = "imagePath")
	private String imagePath;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productInfoId", table = "productInfo")
	private String productInfoId;
	
	@Column(name = "totalStock", table = "productInfo")
	private Integer totalStock;
	
	@Column(name = "unitPrice", table = "productInfo")
	private Integer price;
	
	@Column(name = "totalPrice", table = "productInfo")
	private Integer totalPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String productName, String subCategoryId, String imagePath, String productInfoId,
			Integer totalStock, Integer price, Integer totalPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.subCategoryId = subCategoryId;
		this.imagePath = imagePath;
		this.productInfoId = productInfoId;
		this.totalStock = totalStock;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getProductInfoId() {
		return productInfoId;
	}

	public void setProductInfoId(String productInfoId) {
		this.productInfoId = productInfoId;
	}

	public Integer getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(Integer totalStock) {
		this.totalStock = totalStock;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", subCategoryId=" + subCategoryId
				+ ", imagePath=" + imagePath + ", productInfoId=" + productInfoId + ", totalStock=" + totalStock
				+ ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}

	
	class HoldingPK
	{
			int accId;
			String compId;
	}
}
