package com.lbp.java;

import java.util.Scanner;

public class Code11_DuckNumber_ZeroPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number :: ");
//		int Digit = sc.nextInt();
//		int last = 0;
//		int remaining = 0;
//		boolean flag = false;
//		while (Digit != 0) {
//			last = Digit % 10;
//			if(last == 0) {
//				flag = true;
//				break;
//			}
//			remaining = Digit / 10;
//			Digit = remaining;
//		}
//		if(flag == true) {
//			System.out.println("Duck");
//		} else {
//			System.out.println("Not Duck");
//		}
		
		String str = sc.next();
		if(str.contains("0")) {
			System.out.println("Duck");
		} else {
			System.out.println("Not Duck");
		}
	}

}
