package com.codeVita;

import java.util.Scanner;

public class BestBubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i];
		}

		int descCount = countSwapDesc(arr1, n);
		int ascCount = countSwapAsc(arr2, n);

		if (descCount > ascCount) {
			System.out.println(ascCount);
		} else {
			System.out.println(descCount);
		}
	}

	static int countSwapAsc(int[] arr, int n) {
		int flag = 0;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag++;
				}
			}
		}
		return flag;
	}

	static int countSwapDesc(int[] arr, int n) {
		int flag = 0;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag++;
				}
			}
		}
		return flag;
	}

}
