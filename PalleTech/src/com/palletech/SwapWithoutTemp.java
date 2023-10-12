package com.palletech;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		
		num1 = num1 + num2 ;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1 +" and "+ num2);
		
//		Already swap thats why its print swap same assign 
		
		
		num1 = num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;
		
		System.out.println(num1 +" and "+ num2);
	}

}
