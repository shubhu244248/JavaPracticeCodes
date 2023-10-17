package com.string;

public class SecondString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Akshayn"; // Both string having same size
		String b = "Shubham";
		String str1 = a.toLowerCase();
		String str2 = b.toLowerCase();

		char[] strArr1 = new char[str1.length()];
		char[] strArr2 = new char[str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			strArr1[i] = str1.charAt(i);
			strArr2[i] = str2.charAt(i);
		}

		char[] temp = new char[str1.length()];
		char[] result = new char[temp.length];
		int resIndex = 0;
		for (int i = 0; i <= strArr1.length - 1; i++) {
			for (int j = 0; j <= strArr2.length - 1; j++) {
				if (strArr1[i] == strArr2[j]) {
					for (int k = 0; k <= temp.length - 1; k++) {
						temp[k] = strArr1[i];
					}
//					System.out.println(temp[i]+" ");

					boolean duplicate = false;
					char c = temp[i];
					for (int j1 = 0; j1 < resIndex; j1++) {
						if (result[j1] == c) {
							duplicate = true;
							break;
						}
					}

					if (!duplicate) {
						result[resIndex++] = c;
					}
				}
			}
		}
		for (int i = 0; i < resIndex; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//
//
//	Write a program to take 2 string input and find out the 
//	common char from both string.
