package com.delloite;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        int hours, minutes, totalSeconds;

	        String input = scanner.nextLine();
	        
	        String[] parts = input.split(" ");
	        
	        hours = Integer.parseInt(parts[0]);
	        minutes = Integer.parseInt(parts[1]);
	        
	        totalSeconds = (hours * 3600) + (minutes * 60);
	        
	        // Print the total seconds
	        System.out.println(totalSeconds);
	}

}
