package com.management.cradle.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="/OrdersList")
public class OrdersList {
	
	@Id
	@Column(name = "orderListId")
	private String orderListId;
	
	@Column(name = "productId")	
	private String productId;
	
	@Column(name = "quantity")
	private int quantity;

	@Column(name = "createdDate")
	private LocalDate createdDate;

	public String getOrderListId() {
		return orderListId;
	}

	public void setOrderListId(String orderListId) {
		this.orderListId = orderListId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "OrdersList [orderListId=" + orderListId + ", productId=" + productId + ", quantity=" + quantity
				+ ", createdDate=" + createdDate + "]";
	}
	
}
