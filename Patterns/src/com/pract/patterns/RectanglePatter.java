package com.pract.patterns;

import java.util.Scanner;

public class RectanglePatter {
	public static void nForest(int n) {
		// Write your code here
		for (int line = 1; line <= n; line++) {
			for (int star = 1; star <= n; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nForest(n);
	}
}

//
//
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//

