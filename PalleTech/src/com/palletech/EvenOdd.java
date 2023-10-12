package com.palletech;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
//		Using if and else
		if(num1 % 2 == 0) {
			System.out.println("Even No");
		}else {
			System.out.println("Odd No");
		}
		
//		In Single Line
		
		System.out.println((num1 % 2 == 0) ? "Even No" : "Odd No");
		
//		Using switch case
		switch(num1 % 2) {
		case 0 : System.out.println("Even No");
		break;
		default : System.out.println("Odd No");
		}
	}

}
