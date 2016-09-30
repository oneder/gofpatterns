package AdapterPattern;

import java.util.Random;

public class Book implements Item {
	
	Random generator = new Random();
	
	@Override
	public void displayName(String name) {
		System.out.println("The name of this BOOK is " + name);
	}

	@Override
	public void displayUsage() {
		int uses = generator.nextInt(10);
		System.out.println("The BOOK has been read " + uses + " times");
	}

	@Override
	public void defaultMessage() {
		System.out.println("This is not for you.");
	}

}
