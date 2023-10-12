package com.arrays;

public class BigElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 8, 6, 5 };
		int max = arr[0];

//		if (arr[1] > max) {
//			max = arr[1];
//		}
//		if (arr[2] > max) {
//			max = arr[2];
//		}
//		if (arr[3] > max) {
//			max = arr[3];
//		}
//		System.out.println(max);
		
		for(int i = 1; i <= arr.length-1; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}

}
