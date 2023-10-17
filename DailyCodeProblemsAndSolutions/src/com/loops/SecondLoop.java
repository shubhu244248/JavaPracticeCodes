package com.loops;

public class SecondLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find out the sequense of numbers upto 100 those are
//		perfect divisible by 2 then print that number, divisible by 3
//		then print that number but the number is divisible bye both then
//		seperate out and print.

//		Output:
//			2 Two Only
//			3 Three only
//			4 Two Only
//			6 Both
//			.
//			.
//			.
//			100 Two Only
		int bothcount = 0;
		int twocount = 0;
		int threecount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
//				System.out.println(i + " Both");
				bothcount++;
			} else if (i % 2 == 0) {
//				System.out.println(i + " Two Only");
				twocount++;
			} else if (i % 3 == 0) {
//				System.out.println(i + " Three only");
				threecount++;
			}
		}

		System.out.println(bothcount);
		System.out.println(twocount);
		System.out.println(threecount);
	}

}

//	Write a program to find out count of numbers upto 100 those are
//	perfect divisible by 2, divisible by 3, divisible by both 2 and three
//
// 	Output : Print the count of the numbers and having heading for understanding
