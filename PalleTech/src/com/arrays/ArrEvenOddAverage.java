package com.arrays;

public class ArrEvenOddAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 12, 13, 14, 15 };

		float EvenAvg = 0;
		float OddAvg = 0;
		float tempEven = 0;
		float tempOdd = 0;
//		System.out.println(arr.length);
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				EvenAvg += arr[i];
				tempEven = EvenAvg / arr.length;
			} else {
				OddAvg += arr[i];
				tempOdd = OddAvg / arr.length;
			}
		}

		System.out.println("Even Avg " + tempEven);
		System.out.println("Odd Avg " + tempOdd);

	}

}
