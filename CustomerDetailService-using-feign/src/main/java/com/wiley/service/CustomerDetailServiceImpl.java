package com.wiley.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wiley.bean.Customer;
import com.wiley.bean.CustomerDetail;
import com.wiley.bean.Customers;
import com.wiley.bean.Share;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService{

	@Autowired
	ShareService shareService;
	@Autowired
	CustomerService customerService;
	
	@Override
	public List<CustomerDetail> getCustomerDetail(String id) {
		List<CustomerDetail> customerDetailsList=new ArrayList<CustomerDetail>();
		Customers customers=customerService.getCustomerList(id);
		
		for(Customer customer:customers.getCustomers()) {	
			Share share=shareService.getShareById(customer.getShareId())
;			customerDetailsList.add(new CustomerDetail(id,share.getShareName(),customer.getQuantity(),5,1700,customer.getShareType()));
		}
		return customerDetailsList;
	}


}
