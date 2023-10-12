package com.stringArray;

public class StringArrayWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shubham Ramesh Patil";
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
