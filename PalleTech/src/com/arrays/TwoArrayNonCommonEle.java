package com.arrays;

public class TwoArrayNonCommonEle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 80 };
		int[] arr2 = { 20, 30, 40, 80, 60 };

		for (int i = 0; i < arr1.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				System.out.print(arr1[i] + " ");
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				System.out.print(arr2[i] + " ");
			}
		}
	}
}

//	Write an program to find out the non common elements from two arrays
