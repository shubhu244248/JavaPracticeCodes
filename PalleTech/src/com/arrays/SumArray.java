package com.arrays;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,0,3,4,5};
		int sum = 0;
		for(int i =0; i <= arr.length -1; i++) {
			 sum = arr[i]+arr[i];  
			System.out.println(sum);
//			if(arr[i] != 0) {
//				arr[i] += arr[i];
//			}
//			System.out.println(arr[i]);
		}		
	}

}
