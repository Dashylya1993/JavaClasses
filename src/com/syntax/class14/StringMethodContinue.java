package com.syntax.class14;

public class StringMethodContinue {
	public static void main(String[] args) {
		 System.out.println("---------------- . contains() method------------");
		 
		 //It checks is String contains another sequence of specified characters
		 String str = "good afternoon all";
		 
		 boolean contains = str.contains("afternoon");
		 System.out.println(contains);
		 
		 String searchValue = "Good";
		 boolean isItThere = str.contains(searchValue);
		 System.out.println(isItThere);
		 
		 System.out.println(str.contains("A"));
		 
		 
		 System.out.println("---------------- . startsWith() method------------");
		 String drink = "Water";
		 boolean starts = drink.startsWith("W");
		 System.out.println(starts);
		 
		 System.out.println("---------------- . endsWith() method------------");
		 boolean ends = drink.endsWith("a");
		 System.out.println(ends);
		 System.out.println();
		 
		// drink.startsWith('w');// we need to check if it is starts with specified String, can not be just char
		 
		 String str1 = "Hello Moh";
		 String str2 = "Hello Bylat";
		 System.out.println("String " + str1 + " " + str1.startsWith("Hello"));
		 System.out.println(str2.endsWith("Bulat"));
		 
		 
		 System.out.println("---------------- . equals() method------------");
		 
		 String string1 = "Saturday";
		 String string2 = "Sunday";
		 
		 boolean equality = string1.equals(string2);
		 System.out.println(equality);
		 
		 System.out.println("---------------- . equalsIgnoreCase() method------------");
		 
		 boolean equalityNoCase = string1.equalsIgnoreCase(string2);
		 System.out.println(equalityNoCase);
		 
		 System.out.println();
		 
		 System.out.println("-----------------------Real exam of equals----------------------------");
		 String expected = "Password cannot be emty";
		 String actual = "Password cannot be emty";
		 
		 if(expected.contentEquals(actual)) {
			 System.out.println("Test pass");
		 }else {
			 System.out.println("Test fail");
		 }
		 System.out.println();
		 
		 System.out.println("-----Real exam of equalsIgnoreCase()--------");
		 
		 String expectedBrowser = "Chrome";
		 if (expectedBrowser.equalsIgnoreCase("Chrome")) {
			 System.out.println("Test executed on Chrome browser");
		 }else {
			 System.out.println("Test executed NOT on Chrome browser");
		 }
		 
		 
		 
	}

}
