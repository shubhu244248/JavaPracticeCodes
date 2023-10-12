package com.method;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cl = new Calculator();
		int add = cl.Add(10, 20);
		int sub = cl.Sub(10, 20);
		int mul = cl.Multi(10, 20);
		float div = cl.Div(152, 20);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}

}
