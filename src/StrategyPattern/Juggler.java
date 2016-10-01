package StrategyPattern;

public class Juggler extends Performer {

	public Juggler(String name, int age, String greeting) {
		super(name, age, greeting);
		
		instrumentSkill = new CantPlay();
		juggleSkill = new CanJuggle();
	}
	
}
