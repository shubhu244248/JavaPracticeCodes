package com.string;

public class PallindrumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mam";
		String str1 = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			str1 = str1+str.charAt(i);
		}
		if(str1.equals(str)) {
			System.out.println("It is pallindrom");
		} else {
			System.out.println("It is not pallindrom");
		}
	}

}
