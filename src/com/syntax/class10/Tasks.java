package com.syntax.class10;

public class Tasks {
	public static void main(String[] args) {
		
		
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		System.out.println("-------------------Task #1--------------");
		
		//1st way
		char[] letters = new char[6]; 
		letters [0] = 'A';
		letters [1] = 'B';
		letters [2] = 'C';
		letters [3] = 'D'; 
		letters [4] = 'E'; 
		letters [5] = 'F'; 
		System.out.println(letters[1]);
		
		//2nd way
		char [] letters1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(letters1[1]);
		
		
		
		//2.Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		System.out.println("-------------------Task #2--------------");
		
		//1st way
		String [] name = new String [5];
		name [0] = "Daria";
		name [1] = "Irina";
		name [2] = "Olga";
	    name [3] = "Valya";
	    name [4] = "Anna";
	    System.out.println(name[0]);
				
	    int arrLength = name.length;
	    System.out.println("The length of the array is: " + arrLength);
		
		//2nd way
	    String [] names = { "Anna", "Irina", "Olga", "Valya","Daria"};
	    System.out.println(names[4]);
		
	    
	    
		
	  //3.Create an array of words: Java, Saturday, day, coding, is. 
	  //Print the following sentence using elements of array: “Saturday is Java coding Day”.
	    System.out.println("-------------------Task #3--------------");
	    
	    //1st way
	    String [] word = new String[5];
	    word [0] = "Java";
	    word [1] = "Saturday";
	    word [2] = "day";
	    word [3] = "coding";
	    word [4] = "is";
	    System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

		//2nd way
	    String [] words = {"Java", "Saturday", "day", "coding", "is"};
	    System.out.println(words[1] +" " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
	}

}
