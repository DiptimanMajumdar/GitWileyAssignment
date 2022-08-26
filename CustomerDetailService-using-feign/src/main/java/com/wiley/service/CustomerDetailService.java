package com.wiley.service;

import java.util.List;

import com.wiley.bean.CustomerDetail;

public interface CustomerDetailService {

	List<CustomerDetail> getCustomerDetail(String id);
}
