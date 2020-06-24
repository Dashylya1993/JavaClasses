package com.syntax.class10;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {

		// If I want, I can read rows from a Scanner
		int rows = 3;
		int cols = 7;

		for (int i = 1; i <= rows; i++) {
			System.out.println("Next iteration od outer loop");

			for (int j = 1; j <= cols; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		

		System.out.println("--------------------------------------------------");

		// There are 4 floors
		// Room numbers go from 1.1. 1.2 ... 1.7
		// If I want, I can read floors and rooms from a Scanner
		
		
		int floor = 4;
		int rooms = 7;

		for (int i = 1; i <= floor; i++) {
			// We just moved to a new floor
			// 1
			System.out.print("We are in floor " + i + " --> ");

			// We are iterating the rooms
			for (int j = 1; j <= rooms; j++) {
				// 2
				System.out.print(i + "." + j + " ");
			}
			// The stairs to the next floor
			System.out.println();
		}
		

		
		System.out.println("-------------------------Task-------------------------");
		// Ask the user how many floors does your hotel have?
		// And how many rooms in each floor.
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		
		System.out.println("How many rooms in each floor?");
		int rooms2 = scan.nextInt();

		for (int i = 1; i <= floors; i++) {
			System.out.print("Floor # " + i + " --> ");

			for (int j = 1; j <= rooms2; j++) {
				// 2
				System.out.print(i + "." + j + " ");
			}
			System.out.println();
		
		}
	}

}
