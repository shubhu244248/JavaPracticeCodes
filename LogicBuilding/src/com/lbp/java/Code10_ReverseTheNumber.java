package com.lbp.java;

import java.util.Scanner;

public class Code10_ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :: ");
		int Digit = sc.nextInt();
		int last = 0;
		int remaining = 0;
		int rev = 0;
		while (Digit != 0) {
			last = Digit % 10;
			rev = rev * 10 + last;
			remaining = Digit / 10;
			Digit = remaining;
		}
		System.out.println(rev);
	}
}
