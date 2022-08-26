package com.wiley.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.CustomerDetailList;
import com.wiley.service.CustomerDetailService;

@RestController
public class CustomerDetailResource {
	@Autowired
	CustomerDetailService customerDetailService;

	@GetMapping(path = "details/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDetailList getCustomerDetail(@PathVariable("id") String id) {
		return new CustomerDetailList(customerDetailService.getCustomerDetail(id));
	}
}
