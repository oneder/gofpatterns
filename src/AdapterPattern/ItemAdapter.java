package AdapterPattern;

public class ItemAdapter implements Item {
	
	Idea anIdea;
	
	public ItemAdapter(Idea newIdea) {
		anIdea = newIdea;
	}

	@Override
	public void displayName(String name) {
		anIdea.displayType(name);
	}

	@Override
	public void displayUsage() {
		anIdea.displayRank();
	}

	@Override
	public void defaultMessage() {
		anIdea.displayReaction();
	}
	
}
