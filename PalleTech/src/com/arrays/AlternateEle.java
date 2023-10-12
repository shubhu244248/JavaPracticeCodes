package com.arrays;

public class AlternateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {10,20,30,40,50,60,70,80,90,100};
		for(int i = 0 ; i <= arr.length -1; i = i + 2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		for(int i = arr.length-1 ; i >= 0; i = i - 2) {
			System.out.print(arr[i]+" ");
		}
	}
}
