package FacadePattern;

/*
 * Facade Design Pattern
 *     create a simplified interface that performs many other actions
 *     behind the scenes
 *     relevant in UX
 */

public class TestFacade {

	public static void main(String[] args) {
		VirtualSafeFacade safe = new VirtualSafeFacade(123456789, 0000);
		
		safe.currentItems();
		safe.storeItem("Socks");
		safe.storeItem("Peanut Butter");
		safe.storeItem("Warm Milk");
		safe.removeItem("Toad");
		safe.currentItems();
	}

}
