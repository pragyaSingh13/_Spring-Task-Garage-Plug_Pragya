package com.order.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.Model.Customer;
import com.order.Model.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{
	
		
}
