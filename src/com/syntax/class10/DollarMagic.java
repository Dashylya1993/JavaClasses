package com.syntax.class10;

public class DollarMagic {
	public static void main(String[] args) {
		// Let's print The Dollar
		// $$$$
		// $ $
		// $ $
		// $ $
		// $$$$

		for (int row = 1; row <= 5; row++) {// The outer loop control the row

			for (int col = 1; col <= 4; col++) {// The inner loop control the columns
				if (row == 1 || row == 5) {// In the 1st AND 5th row print everything
					System.out.print("$");
				} else {// in the other rows
					if (col == 1 || col == 4) {// in the 1st or last column print $
						System.out.print("$");
					} else {// In the other columns print +
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}
        //HW Re-do this task without using nested if
		// Hint: you should use && + ||
	}
}
