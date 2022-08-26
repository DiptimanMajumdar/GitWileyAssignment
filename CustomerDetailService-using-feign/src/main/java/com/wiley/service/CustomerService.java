package com.wiley.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wiley.bean.Customers;

@FeignClient("customer-service")
public interface CustomerService {

	@GetMapping(path = "customers/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customers getCustomerList(@PathVariable("id") String id);
	
}
