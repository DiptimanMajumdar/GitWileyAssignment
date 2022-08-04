package com.wiley.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.demo.Operator;

public class ConsumerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConsumerBean.xml");
		
		Operator addition=(Operator) applicationContext.getBean("add");
		Operator substraction=(Operator) applicationContext.getBean("sub");
		Operator multiplication=(Operator) applicationContext.getBean("mul");
		Operator division=(Operator) applicationContext.getBean("div");
		
		//int a=12,b=10;
		
		addition.calculate();
		substraction.calculate();
		multiplication.calculate();
		division.calculate();
	}

}
