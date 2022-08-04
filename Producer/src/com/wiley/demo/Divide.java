package com.wiley.demo;

public class Divide implements Operator {

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
		int div=a/b;
		System.out.println("Division of the numbers: "+div);

	}

}
