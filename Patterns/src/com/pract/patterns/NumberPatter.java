package com.pract.patterns;

public class NumberPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLine = 4;
		for (int line = 1; line <= numLine; line++) {
			for (int num = 1; num <= line; num++) {
				System.out.print(num);

			}
			System.out.println();
		}
	}
}

//
//
//1
//12
//123
//1234
//
//
