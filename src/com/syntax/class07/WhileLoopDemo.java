package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {

		int time = 10;

		// This code will execute one time
		if (time > 12) {
			System.out.println("Good morning!");
		}

		System.out.println("-------------While Loop-----------------");

		while (time <= 12) {
			// This code will execute infinitely.
			// But then we fixed it by adding time++
			System.out.println("Good morning!");
			time++;
		}

//		while (time > 12) {
//			// This block of code will NOT execute
//			System.out.println("Good morning!");
//          time++;

		System.out.println("--------if isRain--------");

		boolean isRain = true;
		if (isRain) {
			System.out.println("Take your umbrella"); // 1 time
		}

//		while (isRain) { 
//			System.out.println("Take your umbrella"); // infinitely 
//		} 

		System.out.println("--------while isRain--------");

		while (isRain) {
			System.out.println("Take your umbrella");
			// isRain++; //compile error
			isRain = false;
		}

		System.out.println("------------------------------");
		// how to print number from 20 to 30
		int y = 20;
		while (y <= 30) {
			System.out.println(y);
			y++;
		}

		System.out.println("------------------------------"); // !!!!!!!!!!!!!!!!!!!
		System.out.println("How to print numbers from 5 to 15 at the same line?");
		int z = 5;
		while (z <= 15) {
			System.out.print(z + " ");
			z++;
		}
		System.out.println();
		System.out.println("------------------------------");

		System.out.println("How to print numbers from 10 to 1");
		int f = 10;
		while (f >= 1) {
			System.out.println(f);
			--f; // 10 9 8 7 6 5 4 3 2 1
		}
//		int f = 10;
//		while (f = 0) {
//			System.out.println(f);
//			--f; // 10 9 8 7 6 5 4 3 2 1
//		}		

//		int f = 10;
//		while (f-- >= 1) {
//			System.out.println(f);
//		} // 10 9 8 7 6 5 4 3 2 1 0

		System.out.println("------------------------------");

		System.out.println("How to print numbers from 50 to 1");
		int k = 50;
		while (k >= 1) {
			System.out.println(k);
			--k;
		}

	}
}
