package com.loops;

public class SevenLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Evensum = 0;
		int Oddsum = 0;
		int Even[] = new int[100];
		int Odd[] = new int[100];
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				Evensum += i * i;
				Even[i] = i*i;
			} else {
				Oddsum += i * i;
				Odd[i] = i * i;
			}
		}
//		System.out.println(Evensum);
//		System.out.println(Oddsum);
//		System.out.println(Evensum-Oddsum);

		for (int i = 0; i <= 10; i++) {
//			if (Even[i] != 0) {
				System.out.print(Even[i] + " ");
//			}

		}
		System.out.println();
		for (int i = 0; i <= 10; i++) {
//			if (Odd[i] != 0) {
				System.out.print(Odd[i] + " ");
//			}
		}
	}
}

//Write a program to find out the difference between square of even no and odd no of sequence upto 1000