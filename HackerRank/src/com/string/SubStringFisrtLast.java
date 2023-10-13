package com.string;

import java.util.*;

public class SubStringFisrtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int num = sc.nextInt();
		
		int size = str1.length() - num;

		String str[] = new String[size+1];
		for (int i = 0; i < size+1; i++) {
			String str2 = (str1.substring(i, i + num));
			str[i] = str2;
			
		}

		Arrays.sort(str);
		System.out.println(str[0]+"\n"+str[size]);
		
//		welcometojava
//		3
		
		
//		ava
//		wel
	}

}
