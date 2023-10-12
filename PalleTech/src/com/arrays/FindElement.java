package com.arrays;

import java.util.*;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = sc.nextInt();
		}
		int find = sc.nextInt();
		int temp = 0;
		for (int j = 0; j <= size - 1; j++) {
			if (arr[j] == find) {
				temp = arr[j];
				System.out.println(temp+" found at "+j);
			}
		}
		if (temp != find) {
			System.out.println("No Found");
		}
	}
}
