package AdapterPattern;

/*
 * Adapter Design Pattern
 *     allows two incompatible interfaces to work together
 *     used when the client expects a target interface
 *     both parties can work together through an adapter class
 */

public class TestAdapter {
	
	public static void main(String[] args) {
		Book book = new Book();
		Idea anIdea = new Idea();
		Item ideaAdapter = new ItemAdapter(anIdea);
		
		System.out.println("The Book:");
		book.displayName("House of Leaves");
		book.displayUsage();
		book.defaultMessage();
		
		System.out.println("\nThe Idea");
		anIdea.displayType("Putter's Reef");
		anIdea.displayRank();
		anIdea.displayReaction();
		
		System.out.println("\nThe Idea with Adapter");
		ideaAdapter.displayName("Canned T-Shirts");
		ideaAdapter.displayUsage();
		ideaAdapter.defaultMessage();
	}
	
}
