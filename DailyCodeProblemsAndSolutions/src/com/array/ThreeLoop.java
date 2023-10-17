package com.array;

public class ThreeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp[] = { 'a', 's', 'h', 'h', 'a' };
		char[] res = new char[temp.length];
		int resIndex = 0;

		// Loop through each character in the array
		for (int i = 0; i < temp.length; i++) {
			boolean duplicate = false;
			char c = temp[i];

			// Check if the current character is a duplicate
			for (int j = 0; j < resIndex; j++) {
				if (res[j] == c) {
					duplicate = true;
					break;
				}
			}

			// If the current character is not a duplicate, add it to the result array
			if (!duplicate) {
				res[resIndex++] = c;
			}
		}

		for (int i = 0; i < resIndex; i++) {
			System.out.print(res[i] + " ");
		}
	}

}



//	Write a program to take the input array and remove all duplicate from array.
//	After removing print only single from duplicate and those are not duplicate
//	print those as same.

//	Note : I just want output as duplicate element occurs once only in output,
//	those are not as it is no sequence matters but output should be correct



