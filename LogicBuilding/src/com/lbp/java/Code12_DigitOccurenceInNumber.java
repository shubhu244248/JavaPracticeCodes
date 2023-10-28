package com.lbp.java;

import java.util.Scanner;

public class Code12_DigitOccurenceInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digOcc = sc.nextInt();
		int last = 0;
		int remaining = 0;
		int count =0;
		while(num != 0 ) {
			last = num % 10 ;
			if(last == digOcc) {
				count++;
			}
			remaining = num / 10;
			num = remaining;
		}
		
		System.out.println(count);
	}
}
