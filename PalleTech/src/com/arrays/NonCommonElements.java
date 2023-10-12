package com.arrays;

public class NonCommonElements {
	 public static int[] findNonCommonElements(int[] arr1, int[] arr2) {
	        int[] nonCommonElements = new int[arr1.length + arr2.length];
	        int count = 0;
	        boolean found;

	        for (int i = 0; i < arr1.length; i++) {
	            found = false;
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                nonCommonElements[count] = arr1[i];
	                count++;
	            }
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            found = false;
	            for (int j = 0; j < arr1.length; j++) {
	                if (arr2[i] == arr1[j]) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                nonCommonElements[count] = arr2[i];
	                count++;
	            }
	        }

	        int[] result = new int[count];
	        for (int i = 0; i < count; i++) {
	            result[i] = nonCommonElements[i];
	        }
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] nonCommonElements = findNonCommonElements(arr1, arr2);

        System.out.print("Non-Common Elements: ");
        for (int element : nonCommonElements) {
            System.out.print(element + " ");
	}
	}
}
