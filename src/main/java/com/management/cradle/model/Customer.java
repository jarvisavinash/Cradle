package com.management.cradle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {
	
	@Id
	private String CustomerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;
	
	
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}	
	
}
