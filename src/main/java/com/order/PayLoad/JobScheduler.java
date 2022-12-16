package com.order.PayLoad;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


import com.order.Model.Customer;
import com.order.Repo.CustomerRepo;

@Configuration
@EnableScheduling
public class JobScheduler {
	
	@Autowired
	private CustomerRepo repo;
	
	//corn job
	@Scheduled(cron = "*/10 * * * * *")
	public void cornJob(){
       List<Customer> customer = repo.findAll();
       Set<Customer> newItems =customer.stream().map((i)->{
    	   if(i.getTotalOrder()<10 && i.getTotalOrder()==9) {
    		   System.out.println("Dear"+i.getCustomerId()+"you are close to acheive gold memebership");
    	   }
    	   else if(i.getTotalOrder()==19) {
    		   System.out.println("Dear"+i.getCustomerId()+"you are close to acheive platinium memebership");
    	   }
    	   return i;
       }).collect(Collectors.toSet());
	}
	
}
