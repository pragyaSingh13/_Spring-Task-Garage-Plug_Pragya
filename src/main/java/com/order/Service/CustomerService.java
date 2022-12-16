package com.order.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Model.Customer;
import com.order.Repo.CustomerRepo;
@Service
public class CustomerService implements CustomerInt{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		      customer.setBadge("Regular");
		      customer.setTotalOrder(0);
		      customer.setOrderStatus("Not Placed");
		      Customer save = customerRepo.save(customer);
			return save;
	}
	
	
	
	
	
}
