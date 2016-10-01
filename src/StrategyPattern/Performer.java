package StrategyPattern;

import java.util.Random;

public class Performer {
	
	private String name;
	private int age;
	private int rating;
	
	private String greeting;
	
	public InstrumentSkill instrumentSkill;
	public JuggleSkill juggleSkill;
	
	private Random generator;
	
	public Performer(String name, int age, String greeting) {
		this.name = name;
		this.age = age;
		this.greeting = greeting;
		
		generator = new Random();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getGreeting() {
		return greeting;
	}
	public void startPerformance() {
		System.out.println("A performer walks onto the stage.\n");
		System.out.println(greeting + "\nMy name is " + name + ".");
	}
	public void endPerformance() {
		rating = generator.nextInt(10);
		
		System.out.println("Thank you, that's the show!");
		System.out.println(name + " leaves the stage.");
		if(rating <= 2)
			System.out.print("The crowd remains silent, and unamused.");
		else if(rating > 2 && rating <= 7)
			System.out.print("The crowd applauds with scattered woos.");
		else
			System.out.print("The crowd roars and demands an encore performance!");
		
		System.out.println("[rating: " + rating + "]\n");
	}
	
	public void tryToPlayInstrument(String instrument) {
		System.out.println(name + " picks up a " + instrument + ".");
		System.out.println(name + instrumentSkill.playInstrument(instrument));
	}
	public void setInstrumentSkill(InstrumentSkill instrumentSkill) {
		this.instrumentSkill = instrumentSkill;
	}
	
	public void tryToJuggle(String object, int amount) {
		System.out.println(name + " begins to juggle " + amount + " " + object + (amount > 1 ? "s." : "."));
		System.out.println(name + juggleSkill.juggle(object, amount));
	}
	public void setJuggleSkill(JuggleSkill juggleSkill) {
		this.juggleSkill = juggleSkill;
	}
	
}
