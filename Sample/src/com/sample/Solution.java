package com.sample;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int days = sc.nextInt();

	        int[] arr = new int[size];
//		int arr[] = { 0, 5, 0, 4, 0 };
//		int days = 2;
	        for(int i = 0; i <= arr.length-1; i++) {
	        	arr[i] = sc.nextInt();
	        	
	        }

		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < days; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == 0) {
					if (arr[j] != 0)
						arr[j - 1] += 2;
//						arr[j + 1] += 2;
				}
				if (arr[j] == 0) {
//					arr[j-1] += 2;
					arr[j] += 2;
//					if(arr[j] != 0)
//						arr[j-1] += 2;
				}

			}
		}
		
		int sum2 = 0;
		for(int i = 0; i <= arr.length-1; i++) {
//			System.out.println(arr[i]);
			sum2 += arr[i];
		}
		System.out.println(sum2+sum);
	}
}