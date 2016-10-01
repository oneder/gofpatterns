package StrategyPattern;

public interface InstrumentSkill {
	
	public String playInstrument(String instrument);
	
}

class CanPlay implements InstrumentSkill {

	@Override
	public String playInstrument(String instrument) {
		return " successfully played the " + instrument + ".";
	}
	
}

class CantPlay implements InstrumentSkill {

	@Override
	public String playInstrument(String instrument) {
		return " failed at playing the " + instrument + ".";
	}
	
}