package com.order.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {

	@Id
	private int customerId;
	private String orderStatus;
	private int totalOrder;
	private String badge;

//	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,orphanRemoval = true)
//	private List<Order> order= new ArrayList<>();
	
	public Customer(int customerId, String orderStatus, int totalOrder, String badge) {
		super();
		this.customerId = customerId;
		this.orderStatus = orderStatus;
		this.totalOrder = totalOrder;
		this.badge = badge;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
//	public List<Order> getOrder() {
//		return order;
//	}
//	public void setOrder(List<Order> order) {
//		this.order = order;
//	}
	
	
	
}
