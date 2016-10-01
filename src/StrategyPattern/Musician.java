package StrategyPattern;

public class Musician extends Performer {

	public Musician(String name, int age, String greeting) {
		super(name, age, greeting);
		
		instrumentSkill = new CanPlay();
		juggleSkill = new CantJuggle();
	}
	
}
