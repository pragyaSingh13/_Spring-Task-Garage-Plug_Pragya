package com.order.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Exception.ResourceNotFound;
import com.order.Model.Customer;
import com.order.Model.Order;
import com.order.PayLoad.ItemRequest;
import com.order.Repo.CustomerRepo;
import com.order.Repo.OrderRepo;
@Service
public class OrderService implements OrderInterface{
	
	@Autowired
	private OrderRepo orderRepo;
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Order orderSave(int customerId, ItemRequest item) {
		// TODO Auto-generated method stub
	      Customer customer = customerRepo.findById(customerId).orElseThrow(()-> new ResourceNotFound("No customer with the given Id"));
	      customer.setTotalOrder(customer.getTotalOrder()+1);
	      Order order = new Order();
	      order.setCustomerId(customerId);
	      order.setOrderId(item.getOrderId());
	      order.setOrderPrice(item.getOrderPrice());
	      if(customer.getTotalOrder()>10 && customer.getTotalOrder()<=20) {
	    	  customer.setBadge("Gold");
	    	  order.setDiscount(item.getOrderPrice()*(.1));
	      }
	      else if(customer.getTotalOrder()>20) {
	    	  customer.setBadge("Platinum");
	    	  order.setDiscount(item.getOrderPrice()*(.2));
	      }
	      customer.setOrderStatus("orderPlaced");
	      customerRepo.save(customer);
	      Order saved= orderRepo.save(order);
	      return saved;
	}



}
