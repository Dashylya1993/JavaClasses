package com.syntax.class06;

import java.util.Scanner;

public class HomeworkWithSwitch {
	public static void main(String[] args) {

		// Einstein said: Spend 95% of the time to understand the problem
		// Spend 5% of the time solving the problem

		// Write a program for user to enter his/hers birth month.
		// Based on the month define the season.
		// Example: if user is born in June, July or August → season ="Summer".
		// At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month = scan.next();

		String season = "Unknown";

		switch (month.toLowerCase()) {// .toLowerCase() converts DECember -> december
		case "December":
			season = "Winter";
			break;
		case "January":
			season = "Winter";
			break;
		case "February":
			season = "Winter";
			break;
		case "March":
			season = "Spring";
			break;
		case "April":
			season = "Spring";
			break;
		case "May":
			season = "Spring";
			break;
		case "June":
			season = "Summer";
			break;
		case "July":
			season = "Summer";
			break;
		case "August":
			season = "Summer";
			break;
		case "September":
			season = "Fall";
			break;
		case "October":
			season = "Fall";
			break;
		case "November":
			season = "Fall";
			break;
		default:
			season = "Unknown";

		}

		System.out.println("You were born in " + season);
	}

//	switch (month) {
//	case "December":
//	case "January":
//	case "February":
//		season = "Winter";
//		break;
//	case "March":
//	case "April";
//	case "May":
//		season = "Spring";
//		break;
//	case "June":
//	case "July":
//	case "August":
//	season = "Summer";
//	      break;
//	case "September":
//	case "October":
//	case "November":
//		season = "Fall";
//		break;

}
