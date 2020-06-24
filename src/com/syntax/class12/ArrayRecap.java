package com.syntax.class12;

public class ArrayRecap {
	public static void main(String[] args) {
		
		String[] colors = new String[3];
		colors [0] = "Blue";
		colors [1] = "Yellow";
		colors [2] = "Red";
		
		
		System.out.println(colors.length);
		System.out.println();
		
		String color = null;
		
		for(int b = 0; b < colors.length; b++) {
			color = colors[b];
		}
		
		System.out.println(color);
		System.out.println();
		
		//advance for loop
		
		for(String c : colors) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
	}

}
