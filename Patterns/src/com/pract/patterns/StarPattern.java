package com.pract.patterns;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLine = 4;
		for (int line = 1; line <= numLine; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*


*
**
***
****
*****


*/
