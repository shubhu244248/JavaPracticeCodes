package com.lbp.java;

import java.util.Scanner;

public class Code4_SalesCategoryPredict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day sales count :: ");
		int salesNo = sc.nextInt();

		if (salesNo >= 30 && salesNo <= 100) {
			if (salesNo >= 30 && salesNo <= 50) {
				System.out.println("You perform :: D Group");
			} else if (salesNo >= 51 && salesNo <= 60) {
				System.out.println("You perform :: C Group");
			} else if (salesNo >= 61 && salesNo <= 80) {
				System.out.println("You perform :: B Group");
			} else if (salesNo >= 81 && salesNo <= 100) {
				System.out.println("You perform :: A Group");
			}

		} else {
			System.out.println("Invalid sales you need to cross criteria");
			System.out.println("Either you enter invalid sales data");
		}
		
	}
}