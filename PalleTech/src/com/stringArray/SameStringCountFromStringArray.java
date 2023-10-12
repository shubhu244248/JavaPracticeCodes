package com.stringArray;

public class SameStringCountFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "palle tech palle j2ee";
		String arr [] = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr [i].equals(arr[j])) {
					count += 2;
				}
			}
			System.out.println(arr[i] + ":" + count);
			count = 1;
		}
	}
}
