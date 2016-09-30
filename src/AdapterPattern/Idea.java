package AdapterPattern;

import java.util.Random;

public class Idea {
	
	Random generator = new Random();
	
	public void displayType(String type) {
		System.out.println("This is an idea about " + type);
	}
	
	public void displayRank() {
		int rank = generator.nextInt(10) + 1;
		System.out.println("This idea is ranked " + rank + " out of 10");
	}
	
	public void displayReaction() {
		System.out.println("Heyyy... That's pretty good.");
	}
	
}
