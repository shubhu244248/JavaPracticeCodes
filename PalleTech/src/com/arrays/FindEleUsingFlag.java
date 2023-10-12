package com.arrays;

public class FindEleUsingFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 11, 12, 13, 12, 15 };
		int find = 12;
		boolean bl = false;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == find) {
				System.out.println(arr[i] + " found at " + i + " position");
				bl = true;
			}
		}
		if (bl = false) {
			System.out.println("Not Found");
		}
	}

}
