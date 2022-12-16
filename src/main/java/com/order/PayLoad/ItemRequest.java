package com.order.PayLoad;

public class ItemRequest {
	
	private int orderId;
	private int orderPrice;
	public ItemRequest(int orderId, int orderPrice) {
		super();
		this.orderId = orderId;
		this.orderPrice = orderPrice;
	}
	public ItemRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	
}
