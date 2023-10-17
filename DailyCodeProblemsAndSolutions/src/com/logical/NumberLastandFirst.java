package com.logical;

public class NumberLastandFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 154;
        int first = n / 100;        // extract the first digit
        int middle = (n / 10) % 10; // extract the middle digit
        int last = n % 10;          // extract the last digit
        
        System.out.println("First digit: " + first);
        System.out.println("Middle digit: " + middle);
        System.out.println("Last digit: " + last);
	}

}


//	Write a program to take input 3 digit no and find out the
//	first middel and last digit of the give no
//	
//	explaination :
//		123
//		
//		output :
//			1 first
//			2 middel
//			3 last