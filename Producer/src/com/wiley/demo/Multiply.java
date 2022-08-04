package com.wiley.demo;

public class Multiply implements Operator {

	int a,b;
	
	
	public void setA(int a) {
		this.a = a;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public void calculate() {
		// TODO Auto-generated method stub

		int m=a*b;
		System.out.println("Product of the numbers: "+m);
	}

}
