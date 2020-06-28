package com.syntax.class15;

public class Task {
	//Create a String that should be combination of letters, 
	//numbers and special characters. 
	//Find out how many alpha characters are there in the String.
	
	public static void main(String[] args) {
		
		String str = "gshjs7789900 oxmjjujs()*@@!!";
		str = str.replaceAll("[^A-Za-z]",  "");
		System.out.println(str.length());
		

	//You have a String a= "Is it saturday?" 
	//Is it raining? Do we have a Java Class today?” 
	//How would you find out how many sentences are in that String?
		
		String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] array = a.split("[?]");
		int sentences = array.length;
		System.out.println("Total number of sentences is " + sentences);
		
		
	}

}
