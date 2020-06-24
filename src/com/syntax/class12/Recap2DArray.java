package com.syntax.class12;

public class Recap2DArray {
	public static void main(String[] args) {
		
		String [] [] animals = {
				{"Cat", "Dog", "Bird", "Hamster"}, //first array or first row
				{"Tiger", "Children", "Bear"}, //second array or second row
			
		};
		
		int howManyArrays = animals.length;// I want to know how many arrays inside
		System.out.println(howManyArrays);// how many rows
		
		//If I want to know how many arrays inside the array
		int elementsFromfirstArray = animals[1].length;
		System.out.println(elementsFromfirstArray);// how many columns in 2 row
		
		String element = animals [1] [1];
		System.out.println(element);
		
		System.out.println();
		
		System.out.println("-------------Using For Loop--------------");
		//how to get all elements from 2D array
		for( int r = 0; r < animals.length; r++) {//loops over rows or 1D arrays
			for (int c = 0; c < animals[r].length; c++) {
				String animal = animals [r] [c];
				System.out.print(animal + " "); // if we want to print in one line
			}
			System.out.println();
		}
		
		System.out.println("-------------Using Enhanced For Loop--------------");
		
		
		
		
		
		
	}

}
