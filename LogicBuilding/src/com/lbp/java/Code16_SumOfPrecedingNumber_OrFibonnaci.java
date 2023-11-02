package com.lbp.java;

import java.util.Scanner;

public class Code16_SumOfPrecedingNumber_OrFibonnaci {

	public static int SumOfPrecedingNum(int num) {
		if (num == 0 || num == 1) {
			return num;
		} else {
			int sum = SumOfPrecedingNum(num - 1) + SumOfPrecedingNum(num - 2);
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer valus :: ");
		int num = sc.nextInt();
		int sum = SumOfPrecedingNum(num);
		System.out.println(sum);
	}

}
