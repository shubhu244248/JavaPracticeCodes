package com.datatypes;

public class DataTypeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to calculate the call bill having 
//		criteria like 
//		if call for 1 hr or less than 1 hr then it will be free
//		if call for 1 hrs less than 2 then charge for 1 min 5 Rs
//		if call for 2 hsrs less than 3 then charge for 1 min 7.5 Rs
//		if call for 3 hrs less than 34 then charge for 1 min 12.5 Rs
//		
//		Test your code as per requirement 
		
//		Solution of yesterday problem
//		1 hr = 60 min 
//		1 min = 5 means that 60*5 per hr
//		call_min = 2.5 * 60
//		charge = call_min * 12.5
		
		float call_hr = (float) 3; 
		float call_min = (float)(call_hr * 60);
//		System.out.println(call_min);
		if(call_min <= 60) {
			int charge = 0;
			System.out.println(charge);
		} else if(call_min > 60 && call_min <= 120) {
			float charge1 = (float)( call_min * 7.5);
			System.out.println(charge1);
		} else if(call_min > 60 && call_min <= 180) {
			float charge2 = (float)(call_min * 12.5);
			System.out.println(charge2);
		}
	}

}
