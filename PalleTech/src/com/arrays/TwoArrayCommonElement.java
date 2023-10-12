package com.arrays;

public class TwoArrayCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 80 };
		int arr1[] = { 20, 30, 40, 80 };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr1.length - 1; j++) {
				if(arr[i] == arr1[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
