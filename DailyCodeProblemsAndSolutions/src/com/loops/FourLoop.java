package com.loops;

public class FourLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Vivek Ramrao Pawar";
		int count = 0;
		for(int i =0; i <= str.length()-1; i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' ||ch == 'O'||ch == 'I' || ch == 'O') {
				count++;
			}
		}
		System.out.println(count);
	}
}
//	Write a program to take input as String and we have to calculate the count of
//	vowels present in String 
//	
//	Input1:
//		Shubham Patil
//		
//	Output1:
//		Vowel Count 4
//	
//	Input2:
//	Vivek Ramrao Pawar
//	
//	Output2:
//		Vowel Count 7
	

