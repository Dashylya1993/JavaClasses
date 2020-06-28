package com.syntax.class15;

public class Homework3 {
	
	//Create a String and print it in reverse order (Sunday -> yadnuS)
	
	public static void main(String[] args) {
		
		String day = "Sunday";
		
		for (int i = day.length() - 1; i >= 0; i--) {
			char letters = day.charAt(i);
			
			System.out.print(letters);
		}

	}

}
