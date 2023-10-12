package com.method;

public class Calculator {

	public int Add(int x, int y) {
		int add = x + y;
		return add;
	}

	public int Sub(int x, int y) {
		int sub = x - y;
		return sub;
	}

	public int Multi(int x, int y) {
		int mul = x * y;
		return mul;
	}

	public float Div(int x, int y) {
		
//		float div = (float) x/y;
		float div =  x / y;
		return div;
	}
}
