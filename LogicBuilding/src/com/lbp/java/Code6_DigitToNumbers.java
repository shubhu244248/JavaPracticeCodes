package com.lbp.java;

import java.util.Scanner;

public class Code6_DigitToNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit :: ");
		int Digit = sc.nextInt();
		
//		int last = Digit %10;
//		System.out.println(last);
//		int first = Digit/10;
//		System.out.println(first);
		System.out.println("The number are extracted from digit are :: ");
		while(Digit != 0) {
			int last = Digit % 10;
			System.out.print(last+" ");
			int remaining = Digit;
			remaining = remaining / 10;
			Digit = remaining;
		}
	}

}
