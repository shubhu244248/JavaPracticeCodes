package com.hackeRank;

import java.util.Arrays;

public class AnagramYesNo {

	public static boolean Anagram(String a, String b) {
		String str1 = a.toLowerCase();
		String str2 = b.toLowerCase();

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		if (arr1.length != arr2.length) {
			return false;
		} else {

	        int n1 = arr1.length;
	        for (int i = 0; i < n1 - 1; i++) {
	            for (int j = i + 1; j < n1; j++) {
	                if (arr1[i] > arr1[j]) {
	                    char temp = arr1[i];
	                    arr1[i] = arr1[j];
	                    arr1[j] = temp;
	                }
	            }
	        }

	        int n2 = arr2.length;
	        for (int i = 0; i < n2 - 1; i++) {
	            for (int j = i + 1; j < n2; j++) {
	                if (arr2[i] > arr2[j]) {
	                    char temp = arr2[i];
	                    arr2[i] = arr2[j];
	                    arr2[j] = temp;
	                }
	            }
	        }

	        String str3 = new String(arr1);
	        String str4 = new String(arr2);
	        
	        if(str3.equals(str4)) {
	        	return true;
	        } else {
	        	return false;
	        }

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "anagram";
		String b = "margana";

		boolean ret = Anagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		System.out.println(ret);
	}

}
