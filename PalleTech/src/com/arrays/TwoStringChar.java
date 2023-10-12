package com.arrays;

public class TwoStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Palle";
		String str2 = "Jave";
		int count =0;
		for(int i =0; i <= str1.length()-1;i++) {
			char temp = str1.charAt(i);
			if(str2.contains(""+temp) == true) {
				System.out.println(temp);
				count++;
				System.out.println(count);
			}
		}
	}

}
