package com.wiley.demo;

public class Addition implements Operator {
	
	int a,b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		int s=a+b;
		System.out.println("Sum of the numbers: "+s);
	}

}
