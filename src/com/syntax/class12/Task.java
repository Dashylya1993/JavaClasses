package com.syntax.class12;

public class Task {
	public static void main(String[] args) {
		
		// lets create an 2D array of int and calculate sum of all odd number
		
		int [] [] numbers = {
				{10, 23, 56, 47},
				{33, 668, 89},
				{1, 9, 0}
		};
		
		//regular for loop
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				int elements = numbers [i] [j];
				if (elements % 2 != 0) {
				sum += elements;			
			}
		}
	}
	System.out.println(sum);
}
}
