package com.lbp.java;

import java.util.Scanner;

public class Code14_LisaBirthday {
	
	public static int YesOrNo(String m, int d) {
		
		if(m.equalsIgnoreCase("July") && d == 5) {
			return 1;
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String month = sc.next();
		int day = sc.nextInt();
		
		int result = YesOrNo(month, day);
		
		System.out.println(result);
	}

}
