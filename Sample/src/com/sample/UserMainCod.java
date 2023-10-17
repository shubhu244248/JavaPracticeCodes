package com.sample;

import java.util.Arrays;
import java.util.*;

public class UserMainCod {

	public static int checkConsecutive(int input1, int[] input2) {

		Arrays.sort(input2);

		for (int i = 0; i < input1 - 1; i++) {
			if (input2[i] + 1 != input2[i + 1]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int result = checkConsecutive(size, arr);
		System.out.println(result);
	}
}
