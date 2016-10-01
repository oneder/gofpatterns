package StrategyPattern;

/*
 * Strategy Design Pattern
 *     allows for interchangeable algorithm usage by encapsulating
 *     various algorithms in an interface, implementing it in the parent
 *     class, and allowing subclasses to dynamically access them
 */

public class TestStrategy {
	
	public static void main(String[] args) {
		Performer theMusicMan = new Musician("Paul", 33, "Hello, everyone!");
		Performer theJuggler = new Juggler("Steve", 24, "What's up, everybody?");
		
		theMusicMan.startPerformance();
		theMusicMan.tryToPlayInstrument("guitar");
		theMusicMan.tryToJuggle("pickle", 7);
		theMusicMan.endPerformance();
		
		theJuggler.startPerformance();
		theJuggler.tryToJuggle("hamburger", 17);
		theJuggler.tryToPlayInstrument("skin flute");
		theJuggler.endPerformance();
	}
	
}
