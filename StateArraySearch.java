package hw4;

import java.lang.reflect.Array;

public class StateArraySearch {
	// Initialize other variables
	static String state = null;
	static String bird = null;
	static String flower = null;
	
	// Create array that holds results
	static String results[][]; 
	
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

	public static void searchStates(String searchString) {
		for (int i = 0; i < Array.getLength(states); i++)
			if (searchString == states[i][0]) {
				System.out.println("its a match");
				state = states[i][0];
				bird = states[i][1];
				flower = states[i][2];
			}
	}
	
	public static void main(String[] args) {
		searchStates("Alaska");
		System.out.println(state);
		System.out.println(bird);
		System.out.println(flower);
		System.out.println(results);
	}
}
