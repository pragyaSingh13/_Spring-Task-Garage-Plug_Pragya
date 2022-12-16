package com.order.Service;

import java.util.List;

import com.order.Model.Customer;
import com.order.Model.Order;
import com.order.PayLoad.ItemRequest;

public interface OrderInterface {
	
	
	Order orderSave(int customerId,ItemRequest item);
}
