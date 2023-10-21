package com.lbp.java;

import java.util.Scanner;

public class Code2_WeiredNotWeird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");

		int num = sc.nextInt();
		if (num >= 1 && num <=100) {
			if (num % 2 == 0) {
				if(num >= 2 && num <=5) {
					System.out.println("Not Weird");
				} else if (num >= 6 && num <= 20) {
					System.out.println("Weird");
				} else if (num >= 20) {
					System.out.println("Not Weird");
				} else {
					System.out.println("Weird");
				}
			} else {
				System.out.println(num + " is the Odd number");
			}
		} else {
			System.out.println("Invalid Input");
			System.out.println("You have entered the negative number");
		}
	}

}
