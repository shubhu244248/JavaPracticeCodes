package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Palle";
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(2));
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(0));
		
//		for(int i = str.length()-1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}
		String str1 = "";
		for(int i = str.length()-1; i >= 0; i--){
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
