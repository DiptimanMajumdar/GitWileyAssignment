package com.wiley.demo;

public class Substraction implements Operator {
	
	int a,b;
	

	public Substraction(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		int d=a-b;
		System.out.println("Difference of the numbers: "+d);

	}

}
