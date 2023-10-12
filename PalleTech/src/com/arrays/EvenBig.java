package com.arrays;

public class EvenBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {20,2,3,4,5,6,7,8,16};
		int max = arr[0];
		
		for (int i =0; i <= arr.length-1; i++) {
			if(arr[i] % 2 ==0 && arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
