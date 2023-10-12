package com.arrays;

public class CoutnOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int OddCount = 0;
		int EvenCount = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] % 2 == 0) {
				EvenCount ++;
			} else {
				OddCount ++;
			}
		}
		System.out.println("Even count : "+ EvenCount);
		System.out.println("Odd count : "+ OddCount);
		
	}

}
