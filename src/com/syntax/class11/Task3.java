package com.syntax.class11;

public class Task3 {
	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all value from an array print capital for each country.

		String[] countries = { "Tajikistan", "Brazil", "Pakistan", "Gambia", "US" };
		
		System.out.println("----------------Elion way--------------------------");
		String[] capitalCities = {"Dushambe", "Brasilia", "Islamabad", "Banjul", "Washington DC"};
		
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			String city = capitalCities[i];
			System.out.println("The capital city of " + countries[i] + " is " + capitalCities[i]);
		}
		
		//Try to solve this way with enhanced for loop
		//Hint: you should not be able to do it
		
		// for (String country : countries){}
		
		
		System.out.println();
	    System.out.println("--------------------Way with ForNestedLoop---------------------");

		for (String country : countries) {
			if (country.equals("Albania")) {
				System.out.println("Tirana");
			} else if (country.equals("Brazil")) {
				System.out.println("Brasilia");
			} else if (country.equals("US") || country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Tajikistan")) {
				System.out.println("Dushanbe");
			} else if (country.equalsIgnoreCase("Gambia")) {
				System.out.println("Banjul");
			} else {
				System.out.println("The country" + country + " is not in my list");
			}
		}
		System.out.println();
		

		System.out.println("--------------------Switch 1st way------------------");

		String capital = null;
		String[] countries2 = { "Russia", "USA", "Italia", "Albania" };

		for (String c : countries2) {
			switch (c) {
			case "Russia":
				capital = "Moscow";
				break;
			case "USA":
				capital = "Washington DC";
				break;
			case "Italia":
				capital = "Roma";
				break;
			case "Albania":
				capital = "Tirana";
				break;
			}
			System.out.println("The capital of " + c + " is " + capital);
		}
		System.out.println();
		

//		System.out.println("--------------------Switch 2nd way----------------------");
//
//		for (int i = 0; i < countries.length; i++)
//			
//			switch (countries[i]) {
//			case "Russia":
//				System.out.println("Moscow");
//				break;
//			case "USA":
//				System.out.println("Washington DC");
//				break;
//			case "Italia":
//				System.out.println("Roma");
//				break;
//			case "Albania":
//				System.out.println("Tirana");
//				break;
//			default:
//				System.out.println("Not in my list");
//			}
	}

}
