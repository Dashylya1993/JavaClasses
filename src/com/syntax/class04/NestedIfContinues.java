package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		//check if patient has allergies
		//if no allergies --> You're healthy
		//otherwise (else):
		//if peanut allergy: Don't eat peanut
		//Lactose allergy: Don't drink milk
		//Bee allergy: Don't mess with bees
		//Seafood allergy: Don't eat fish
	
	
	boolean Allergies = true;
	boolean peanut = true;
	boolean lactose = false;
	boolean bee = true;
	
	if (Allergies) {
	if (peanut) {
			System.out.println("Don't eat peanut!");		
	}
	if (lactose) {
		System.out.println("Don't drink milk!");	
	}
	if (bee) {
		System.out.println("Don't mess with bees");
	} else {
		System.out.println("You're healthy");
	}
	}
	}
}
