package com.array;

public class FirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 11, 12, 13, 14, 15, 16,12 };
		int arr2[] = { 16, 12, 14, 12, 15, 17,12 };
		int find = 12;

		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr1[i] == find && arr2[j] == find) {
					System.out.println("Found at" + i + " " + j);
				}
			}
		}
	}
}


//	Write a program to find out the element is present in array or not
//	
//	Exaplaination:
//		Input: 
//			
//		First Line = size of array up tu N
//		Second line = array elements
//		Third line = element that you are finding
//		
//		Output:
//			
//		Print the element with their index
//		
//		
//	Input1:
//		3
//		1 5 3
//		3
//	Output1:
//		3 found at 2
//		
//	Input2:
//		5
//		1 2 3 4 5
//		6
//	Output2:
//		No Found
		
		
