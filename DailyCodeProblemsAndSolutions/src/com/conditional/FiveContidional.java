package com.conditional;

import java.util.*;

public class FiveContidional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Data Types :
//			Pre Define datatypes byte, short, int, long, float, double char, boolean
//			Write a program to print the size of that perticular data type
//		
//		Test case 1:
//			int
//			4 byte Or 8 bits
//			
//		Test case 2:
//			double
//			8 byte Or 64 bits
		
//		Extra if you learn something then convert byte to bits using mathematical logic
//		code is as per your choice then but solution must print same as above.
		

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		switch (str) {
		case "int":
			System.out.println("int 4 byte Ors 32 bits");
			break;
		case "double":
			System.out.println("Double");
		}

	}

}
