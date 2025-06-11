package com.techStack.entity;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String customerName;
    private String orderDate;
    private List<String> products;
    
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
    
}
