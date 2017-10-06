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
// import java.util.Arrays;

public class StatessDataEntry {
	// Variables to hold values
	static Scanner scannerIn = new Scanner(System.in);
	static String in = null;
	static String state = null;
	static String bird = null;
	static String flower = null;
	
	// MultiDemension Array to hold input
	String input[][]; 
	
	// Method to recieve input
	public static void promptForInput() {
		System.out.println("Enter a State or None to exit: ");
		state = scannerIn.nextLine();
		state = state.toLowerCase();
		if (state == "none") {
			return;
		}
		if (state != "none") {
			System.out.print("Bird: ");
			bird = scannerIn.nextLine();
			System.out.print("Flower: ");
			flower = scannerIn.nextLine();
		}
	}
	
	// Print input[][] information
	public static void printInput() {
		// Next 2 lines are for testing
		System.out.println("printInput()");
		System.out.println("State is: " + state + ". Bird is " + bird + ". Flower is " + flower);
	}
}
