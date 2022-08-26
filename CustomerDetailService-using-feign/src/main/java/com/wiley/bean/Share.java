package com.wiley.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {

	private String shareId;
	private String shareName;
	private double marketPlace;
}
