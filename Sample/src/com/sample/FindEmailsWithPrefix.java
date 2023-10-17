package com.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindEmailsWithPrefix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:/Users/LENOVO/Downloads/=/email.txt";
        String prefixToFind = "sam";
        try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			 String line;
	            try {
					while ((line = reader.readLine()) != null) {
					    String email = line.trim();
					    if (email.startsWith(prefixToFind)) {
					        System.out.println(email);
					    }
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
