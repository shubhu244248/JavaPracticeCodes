package com.stringArray;

public class StringArrayReverseAndFPosLLPosF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shubham Ramesh Patil";
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			char last = arr[i].charAt(arr[i].length() - 1);
			char first = arr[i].charAt(0);
			String temp = arr[i].substring(1,arr[i].length()-1);
			System.out.print(last+temp+first+" ");
		}
	}
}
