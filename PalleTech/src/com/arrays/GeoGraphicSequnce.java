package com.arrays;

import java.util.Scanner;

import java.util.*;
public class GeoGraphicSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
//
//		1, 2, 4, 8, 16, 32, 64, ......, 1024
//
//		 
//
//		Sample Input and Output
//		5 
//		1, 2, 4, 8, 16
//		
//		8
//		1, 2, 4, 8, 16, 32, 64, 128
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		System.out.print(count+", ");
		for(int i = 1; i <= n-1; i++){
//		   if(count == 1) {
//			   System.out.println(count);
//			   count++;
//		   } else {
			   count += count;
			   System.out.print(count);
			   if(i < n-1) {
				   System.out.print(", ");
			   }
		   
		}

	}

}
