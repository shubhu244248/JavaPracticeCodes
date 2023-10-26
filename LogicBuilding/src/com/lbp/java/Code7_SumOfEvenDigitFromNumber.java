package com.lbp.java;

import java.util.Scanner;

public class Code7_SumOfEvenDigitFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int Digit = sc.nextInt();
		int last = 0;
		int remaining = 0;
		int sum = 0;
		while (Digit != 0) {
			last = Digit % 10;
			if (last % 2 == 0)
				sum += last;
			remaining = Digit / 10;
			Digit = remaining;
		}
		System.out.println("Sum of even Digit from Number is :: " + sum);
	}
}
