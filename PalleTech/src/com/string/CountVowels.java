package com.string;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "palle";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char temp = str.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i'|| temp == 'o' || temp == 'u' ||
					temp == 'A' || temp == 'E' || temp == 'I'|| temp == 'O' || temp == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
