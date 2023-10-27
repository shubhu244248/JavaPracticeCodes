package com.prep.commons;

import java.util.Scanner;

public class Code2_PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count ==2) { // either it is divisible by its own or by 1 for that I consider count as 2
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
