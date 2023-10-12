package com.arrays;

public class StringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Shubham Ramesh Patil Ganpur  Chopda   Jalgaon "; //Work on extra spaces 
		
		String str1 = str.trim();
//		System.out.println(str1);
//		int arr[] = new int [str.length()];
		int count = 1;
		for(int i = 0; i <= str1.length()-1; i++) {
			if(str1.charAt(i) == ' ') {
				if(str1.charAt(i+1) == ' ') {
					count++;
					break;
				}			
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
