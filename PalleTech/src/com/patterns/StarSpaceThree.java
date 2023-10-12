package com.patterns;

public class StarSpaceThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
//				if (i == 1 && j == 1) {
//					System.out.print("* ");
//				} else if (i == 2 && (j == 1 || j == 2)) {
//					System.out.print("* ");
//				} else if (i == 3 && (j == 1 || j == 3)) {
//					System.out.print("* ");
//				} else if (i == 4 && (j == 1 || j == 4)) {
//					System.out.print("* ");
//				} else if (i == 5 && (j == 1 || j == 5 || j == 2 || j == 3 || j == 4)) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();

				if (j == 1 || j == i || i == 5) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
