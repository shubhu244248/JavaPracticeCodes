package com.lbp.java;
import java.util.Scanner;

public class Code8_SumOfPrimeDigitFromNumber {
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
			if (last ==2 || last == 3 || last == 5 || last == 7)
				sum += last;
			remaining = Digit / 10;
			Digit = remaining;
		}
		System.out.println(sum);
	}

}
