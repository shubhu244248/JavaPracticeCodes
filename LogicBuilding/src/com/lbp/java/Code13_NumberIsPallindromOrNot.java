package com.lbp.java;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class Code13_NumberIsPallindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int digOcc = sc.nextInt();
		int last = 0;
		int remaining = num;
		int count =0;
		int rev = 0;
		while(remaining != 0 ) {
			last = remaining % 10 ;
			remaining = remaining / 10;
//			num = remaining;
			rev = rev * 10 + last;
		}
		if(rev == num) {
			System.out.println("Yes");
		} else {
//			System.out.println(num);
//			System.out.println(rev);
			System.out.println("No");
		}
	}

}
