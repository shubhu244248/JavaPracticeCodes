package com.prep.commons;

import java.util.Scanner;

public class Code1_PallindromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String str = sc.nextLine();
		
		String rev = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if (rev.equals(str)){
			System.out.println("String is Pallindrom");
		} else {
			System.out.println("String is Not - Pallindrom");
		}
	}

}
