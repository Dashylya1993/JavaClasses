package com.syntax.class10;

public class TrianglePattern {
	public static void main(String[] args) {

		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Let us add the second triangle
		// ****
		// ***
		// **
		// *

		for (int r = 4; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("--------------------------------------------------------");
		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1

		for (int r = 5; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
	
		System.out.println("--------------------------------------------------------");
		// Print the following pattern:
		// 54321
		// 4321
		// 321
		// 21
		// 1
		
		for (int o = 5; o > 0; o--) {

			for (int l = o; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		
		
		System.out.println("--------------------------------------------------------");
		// Print the following pattern:
		// 1
		// 21
		// 321
		// 4321
		// 54321
		// 4321
		// 321
		// 21
		// 1
		
		for (int h = 1; h <= 5; h++) {

			for (int t = h; t >= 1; t--) {
				System.out.print(t);
			}
			System.out.println();
		}
	}
}
