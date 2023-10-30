package com.lbp.java;

import java.util.Scanner;

public class Code15_DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int decNum = sc.nextInt();
//		int last = 0;
//		int arr[] = new int[100];
//		int i = 0;
//		while (decNum != 0) {
//			last = decNum % 2;
//			arr[i++] = last;
//			decNum = decNum / 2;
//		}
//
//		for (i = i - 1; i >= 0; i--) {
//			System.out.print(arr[i]);
//		}
		
		String binary = Integer.toBinaryString(decNum);
		System.out.println(binary);
	}
}
