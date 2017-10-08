package hw4;
/*
* File: StatesDataEntry.java
* Author: Yael Brown
* Date: October 5, 2017
* Purpose: This program prompts the user to 
* enter a State and prints both the state
* bird and flower. 
*/

import java.lang.reflect.Array;
// Import required classes
import java.util.Scanner;
// import java.util.Arrays;

public class StatessDataEntry {
	// Variables to hold values
	static Scanner scannerIn = new Scanner(System.in);
	static String in = null;
	static String state;
	static String bird;
	static String flower;
	
	// MultiDemension Array to hold input
	// static String input[][]; 
	
	// Initialize State Array with bird and flower information
	static String[][] states = new String[][]{
		{ "Alabama", "Yellowhammer", "Camellia" },
	    { "Alaska", "Willow Ptarmigan", "Forget-me-not" },
	    { "Arizona", "Cactus Wren", "Saguaro Cactus Blossom" },
	    { "Arkansas", "Mockingbird", "Apple Blossom" },
	    { "California", "California Valley Quail", "Golden Poppy" },
	    { "Colorado", "Lark Bunting", "Columbine" },
	    { "Connecticut", "American Robin", "Mountain Laurel" },
	    { "Delaware", "Blue Hen Chicken", "Peach Blossom" },
	    { "Florida", "Mockingbird", "Orange Blossom" },
	    { "Georgia", "Brown Thrasher", "Cherokee Rose" },
	    { "Hawaii", "Nene (Hawaiian Goose)", "Hibiscus" },
	    { "Idaho", "Mountain Bluebird", "Syringa" },
	    { "Illinois", "Cardinal", "Native Violet" },
	    { "Indiana", "Cardinal", "Peony" },
	    { "Iowa", "Eastern Goldfinch", "Wild Rose" },
	    { "Kansas", "Western Meadowlark", "Native Sunflower" },
	    { "Kentucky", "Kentucky Cardinal", "Goldenrod" },
	    { "Louisiana", "Pelican", "Magnolia" },
	    { "Maine", "Chickadee", "Mayflower" },
	    { "Maryland", "Baltimore Oriole", "Black-Eyed Susan" },
	    { "Massachusetts", "Chickadee", "Mayflower" },
	    { "Michigan", "Robin", "Apple Blossom" },
	    { "Minnesota", "Common Loon", "Pink and White Lady's Slipper" },
	    { "Mississippi", "Mockingbird", "Magnolia" },
	    { "Missouri", "Bluebird", "Hawthorn" },
	    { "Montana", "Western Meadowlark", "Bitterroot" },
	    { "Nebraska", "Western Meadowlark", "Goldenrod" },
	    { "Nevada", "Mountain Bluebird", "Sage Brush" },
	    { "New Hampshire", "Purple Finch", "Purple Lilac" },
	    { "New Jersey", "Eastern Goldfinch", "Purple Violet" },
	    { "New Mexico", "Roadrunner", "Yucca Flower" },
	    { "New York", "Bluebird", "Rose" },
	    { "North Carolina", "Cardinal", "Dogwood" },
	    { "North Dakota", "Western Meadowlark", "Wild Prairie Rose" },
	    { "Ohio", "Cardinal", "Scarlet Carnation" },
	    { "Oklahoma", "Scissor-Tailed Flycatcher", "Mistletoe" },
	    { "Oregon", "Western Meadowlark", "Oregon Grape" },
	    { "Pennsylvania", "Ruffed Grouse", "Mountain Laurel" },
	    { "Rhode Island", "Rhode Island Red", "Violet" },
	    { "South Carolina", "Carolina Wren", "Yellow Jessamine" },
	    { "South Dakota", "Ring-Necked Pheasant", "American Pasqueflower" },
	    { "Tennessee", "Mockingbird", "Iris" },
	    { "Texas", "Mockingbird", "Bluebonnet" },
	    { "Utah", "California Gull", "Sego Lily" },
	    { "Vermont", "Hermit Thrust", "Red Clover" },
	    { "Virginia", "Cardinal", "Dogwood" },
	    { "Washington", "Willow Goldfinch", "Western Rhododendron" },
	    { "West Virginia", "Cardinal", "Big Rhododendron" },
	    { "Wisconsin", "Robin", "Wood Violet" },
	    { "Wyoming", "Meadowlark", "Indian Paintbrush" },
	};
	
	// Method that searches for state information
	public static void searchStates(String state) {
		for (int i = 0; i < Array.getLength(states); i++)
			if (state == states[i][0]) {
				System.out.println("its a match");
				state = states[i][0];
				bird = states[i][1];
				flower = states[i][2];
			}
	}
	
	// Method to recieve input
	public static void promptForInput() {
		System.out.println("Enter a State or None to exit: ");
		state = scannerIn.nextLine();
		state = state.toLowerCase();
		for (int i = 0; i < Array.getLength(states); i++)
			if (state == states[i][0]) {
				System.out.println("its a match");
				state = states[i][0];
				bird = states[i][1];
				flower = states[i][2];
			}
	}
	
	// Print input[][] information
	public static void printInput() {
		// Next 2 lines are for testing
		System.out.println("printInput()");
		System.out.println("State is: " + state + ". Bird is " + bird + ". Flower is " + flower);
	}
}
