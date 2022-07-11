package com.model;

public class Customer {
 private String customerId;
 private String customerName;
 private String customerPhone;
 private String customerEmail;
public Customer(String id, String customerName, String customerPhone, String customerEmail) {
	super();
	this.customerId = id;
	this.customerName = customerName;
	this.customerPhone = customerPhone;
	this.customerEmail = customerEmail;
}
public String getCustomerId() {
	return customerId;
}
public String getCustomerName() {
	return customerName;
}
public String getCustomerPhone() {
	return customerPhone;
}
public String getCustomerEmail() {
	return customerEmail;
}
 

 
}
