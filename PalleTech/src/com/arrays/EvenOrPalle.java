package com.arrays;

public class EvenOrPalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]+" ");
			} else {
				System.out.println("Palle");
			}
		}
	}

}
