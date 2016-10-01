package StrategyPattern;

public interface JuggleSkill {
	
	public String juggle(String object, int amount); 
	
}

class CanJuggle implements JuggleSkill {

	@Override
	public String juggle(String object, int amount) {
		return " successfully juggled " + amount + " " + object + (amount > 1 ? "s." : ".");
	}
	
}

class CantJuggle implements JuggleSkill {

	@Override
	public String juggle(String object, int amount) {
		return " failed and dropped every " + object + ".";
	}
	
}
