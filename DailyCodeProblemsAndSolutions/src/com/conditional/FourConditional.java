package com.conditional;

import java.util.*;

public class FourConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program for take input as a string and find out the
//		which is starting alphabate of the String  
//		Note : String can be start with Capital or Small letter
//		
//		Test case 1:
//			John Patil
//			J
		
//		Test case 2:
//			john Patil
//			j
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		if(Character.isLetter(ch)) {
			System.out.println(ch);
		} else {
			System.out.println("Invalid");
		}

		
	}

}
