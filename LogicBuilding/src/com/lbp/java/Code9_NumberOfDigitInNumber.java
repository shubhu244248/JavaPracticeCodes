package com.lbp.java;

import java.util.Scanner;

public class Code9_NumberOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number :: ");
		int Digit = sc.nextInt();
//		int last = 0;
//		int remaining = 0;
//		int count = 0;
//		while (Digit != 0) {
//			last = Digit % 10;
//			count++;
//			remaining = Digit / 10;
//			Digit = remaining;
//		}
//		System.out.println(count);
		String NoOfDigit = String.valueOf(Digit);
		System.out.println(NoOfDigit.length());
	}
}
