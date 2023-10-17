package com.array;

public class FourArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = {1,2,4,5,1,2,5,6,3,1 };
		int[] res = new int[temp.length];
		int resIndex = 0;

		// Loop through each character in the array
		for (int i = 0; i < temp.length; i++) {
			boolean duplicate = false;
			int n = temp[i];

			// Check if the current character is a duplicate
			for (int j = 0; j < resIndex; j++) {
				if (res[j] == n) {
					duplicate = true;
					break;
				}
			}

			// If the current character is not a duplicate, add it to the result array
			if (!duplicate) {
				res[resIndex++] = n;
			}
		}

		for (int i = 0; i < resIndex; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
