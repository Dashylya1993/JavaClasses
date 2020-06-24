package com.syntax.class08;

import java.util.Scanner;

public class HomeworkLottery {
	public static void main(String[] args) {

		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20;
		// until he guesses the lucky number
		// --> In that case we print "Congrats, you won!"

		Scanner scan = new Scanner(System.in);
		int lucky = 17;
		int num;
		// If I use while loop I have to ask 2 times
		System.out.println("Please enter a number from 1 to 20: ");
		num = scan.nextInt();

		while (num != lucky) {
			System.out.println("Please enter a number from 1 to 20: ");
			num = scan.nextInt();
		}
		System.out.println("Congrats, you won!");

        
		//If I use Do While loop I have to ask 1 time
		do {
			System.out.println("Please enter a number from 1 to 20: ");
			num = scan.nextInt();
		} while (num != lucky);

		System.out.println("Congrats, you won!");
	}

}
