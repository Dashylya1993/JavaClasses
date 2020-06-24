package com.syntax.class09;

public class MorePatterns {
	public static void main(String[] args) {
		//12345
		//12345
		//12345
		
		//How many rows? 3
		for (int row = 1; row <= 3; row++) {
			//how many calumns? 5
			
			for (int col = 1; col <= 5; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("---------------TASK-------------------");
		
		//11111
	    //22222
		//33333
		//44444
		for (int row = 1; row <= 4; row++) {
			
			for (int col = 1; col <= 5; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
