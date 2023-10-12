package com.stringArray;

public class StringSplitiInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Palle tech java j2e";

		String arr[] = str.split(" ");
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println(arr[0]+ " " +arr[1]+" "+arr[2]+" "+arr[3]);
	}

}
