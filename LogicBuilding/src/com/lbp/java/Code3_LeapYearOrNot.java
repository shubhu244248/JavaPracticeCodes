package com.lbp.java;

import java.util.Scanner;

public class Code3_LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : as : 1999 ::");
		int yr = sc.nextInt();
		if((yr % 4 ==0 && yr % 100 != 0 )||( yr % 400 ==0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}
}
