package com.syntax.class06;

import java.util.Scanner;

public class TaskLanguageSwitch {
	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your country");
		String country = scan.next();

		String Language = "Unknown";
		
		switch (country) {
		case "Russia":
			Language = "Russian";
			break;
		case "USA":
			Language = "English";
			break;
		case "France":
			Language = "French";
			break;
		case "Italian":
			Language = "Italian";
			break;
		case "Spanish":
			Language = "Spanish";
			break;
		default:
			Language = "Unknown";
		
		}

		System.out.println("Your language is  " + Language);
		
			
		
	}

}
