package com.arrays;

import java.util.*;
public class EvenEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
