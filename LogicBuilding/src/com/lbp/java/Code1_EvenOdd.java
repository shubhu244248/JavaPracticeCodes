package com.lbp.java;

import java.util.Scanner;

public class Code1_EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");

		int num = sc.nextInt();
		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println(num + " is the Even number");
			} else {
				System.out.println(num + " is the Odd number");
			}
		} else {
			System.out.println("Invalid Input");
			System.out.println("You have entered the negative number");
		}
	}

}
