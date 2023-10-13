package com.MountBlue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {

	public static int ArrSum(List<Integer> al) {
		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum = sum + al.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			al.add(sc.nextInt());
		}

		int sum = ArrSum(al);

		System.out.println(sum);
	}

}
