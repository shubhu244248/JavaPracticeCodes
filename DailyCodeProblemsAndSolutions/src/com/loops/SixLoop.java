package com.loops;

public class SixLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Shubham Patil";
		String str1 = "";
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		str1 = str.substring(1, str.length() - 1);
		System.out.println(last + "" + str1 + "" + first);
	}
}


//Write a program to take input as a string and perform opration on that
//String first char at last, last char at first. Print String
//
//Input1:
//	Shubham Patil
//
//Output1 
//	lhubham PatilS
//
//Note: Your string should not be start and end with space. If start and end
//then you have to code for the same. If you want then next task for you.
//
//consider * as space first and # as last space becaouse space is not visible
//
//Input:
//	*Shubham Patil#
//	
//Output:
//	#lhubham PatiS*
