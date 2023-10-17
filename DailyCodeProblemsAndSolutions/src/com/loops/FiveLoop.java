package com.loops;

public class FiveLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int add = 0;
		int upto = 100;
		for (int i = 0; i <= upto; i++) {
			if (i % 2 == 0) {
				i = i + 2;
				temp = i;
				if (i <= upto) {
					System.out.print(temp + " ");
					add += temp;
				}

			}
		}
		System.out.println(" \n"+add);
	}
}

//	Write a program to calculate the sum of alternate even number of sequence upto 100

//	Explanation :
//		As we know the even num of seuqunce is stated with 2,4,6,8,10........100
//		
//		But we have to find out the sum of 2,6,10........98
//		Here we eliminate the 4,8,.........96

//		Expected output for sum of alternate even no of sequence upto 100 is 1250


