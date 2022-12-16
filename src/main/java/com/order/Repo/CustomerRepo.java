package com.order.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.Model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
