package hw4;
/*
* File: StatesDataEntry.java
* Author: Yael Brown
* Date: October 5, 2017
* Purpose: This program prompts the user to 
* enter a State and prints both the state
* bird and flower. 
*/

// Import required classes
import java.util.Scanner;
import java.util.Arrays;

public class StatesDataEntry {
	// Variables to hold values
	static Scanner scannerIn = new Scanner(System.in);
	static String input = null;
	static String bird = null;
	static String flower = null;
	
	// Arrays with bird and flower information
	static String maryland[] = {"Baltimore Oriole", "Black-eyed Susan"};
	
	// Prompt user for state
	public static void promptForState() {
		System.out.println("Enter a State or None to exit: ");
		input = scannerIn.nextLine();
		input = input.toLowerCase();
		System.out.println(input);
	}
	
	// Print state bird 
	public static void printStateBird() {
		System.out.println(Arrays.toString(maryland));
	}
}
