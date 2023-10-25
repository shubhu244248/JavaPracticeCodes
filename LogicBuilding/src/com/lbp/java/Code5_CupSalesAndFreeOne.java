package com.lbp.java;

import java.util.Scanner;

public class Code5_CupSalesAndFreeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of cups you order : ");

		int OrdCups = sc.nextInt();
//		int count = 0;
//		int remaining =0;
//		if(OrdCups > 0) {
//			if(OrdCups / 6 <= 0) {
//				System.out.println("Order cups are :: "+ OrdCups);
//			} else {
//				remaining = OrdCups / 6;
//				count ++;
//			}
//			
//			remaining = remaining * count + OrdCups;
//			System.out.println("Total order with free cups : "+remaining);
//		} else {
//			System.out.println("Invalid cup order It should be positive number...");
//		}

		if (OrdCups > 0) {
			System.out.println("Total cups with free cups are : " + (OrdCups + (OrdCups / 6)));
		} else {
			System.out.println("Invalid cup order It should be positive number...");
		}
	}

}
