package com.order.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.order.Model.Customer;
import com.order.Model.Order;
import com.order.Repo.CustomerRepo;
import com.order.Repo.OrderRepo;

@SpringBootTest
public class RepositoryTest {

	@Autowired
	private OrderRepo repo;
	@Autowired
	private CustomerRepo customerRepo;
	
	@Test
	@DisplayName("to test we can save in database")
	void testSave() {
		Order order = new Order();
		order.setCustomerId(12);
		order.setDiscount(12);
		order.setOrderId(2);
		order.setOrderPrice(1000);
		
		Order orderSave = repo.save(order);
		assertEquals(orderSave.getCustomerId(), order.getCustomerId());
		assertEquals(orderSave.getDiscount(), order.getDiscount());
		assertEquals(orderSave.getOrderId(), order.getOrderId());
		assertEquals(orderSave.getOrderPrice(), order.getOrderPrice());
		
		assertNotNull(orderSave);
	}
	
	@Test
	@DisplayName("to test we can save in database")
	void customerTestSave() {
		Customer customer = new Customer();
		customer.setBadge("regular");
		customer.setCustomerId(12);
		customer.setOrderStatus("placed");
		customer.setTotalOrder(2);
		
		Customer save = customerRepo.save(customer);
		assertEquals(save.getBadge(), customer.getBadge());
		assertEquals(save.getCustomerId(), customer.getCustomerId());
		assertEquals(save.getOrderStatus(), customer.getOrderStatus());
		assertEquals(save.getTotalOrder(), customer.getTotalOrder());
		
		assertNotNull(save);
		
	}
	
	
}
