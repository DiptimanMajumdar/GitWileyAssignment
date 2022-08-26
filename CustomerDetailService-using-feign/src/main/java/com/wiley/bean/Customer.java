package com.wiley.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private int detailId;
	private String customerId;
	private String shareId;
	private String shareType;
	private int quantity;
}
