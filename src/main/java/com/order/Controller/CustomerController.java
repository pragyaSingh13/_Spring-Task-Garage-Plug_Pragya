package com.order.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.Model.Customer;
import com.order.Model.Order;
import com.order.PayLoad.ItemRequest;
import com.order.Service.CustomerInt;
import com.order.Service.OrderInterface;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerInt customerSer;
	@Autowired
	private OrderInterface orderSer;
	@PostMapping("/")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		        Customer createCustomer = customerSer.createCustomer(customer);
		        return new ResponseEntity<Customer>(createCustomer,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/order/{id}")
	public ResponseEntity<Order> createOrder(@PathVariable int id,@RequestBody ItemRequest item){
		           Order orderSave = orderSer.orderSave(id, item);
		           return new ResponseEntity<Order>(orderSave,HttpStatus.CREATED);
	}
		
}
