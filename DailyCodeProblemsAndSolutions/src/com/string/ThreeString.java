package com.string;

public class ThreeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ShuBHam";
		String s1 = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isUpperCase(str.charAt(i)))

				s1 = s1 + Character.toLowerCase(str.charAt(i));

			else

				s1 = s1 + Character.toUpperCase(str.charAt(i));
		}
		System.out.println(s1);
	}

}


//
//	Write a program to take input as a String and Perform a task
//	to convert each upper case char to lower case vise versa
//	
//	Input1
//	ShuBham
//	
//	Output1
//	sHUbHAM

