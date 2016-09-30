package FacadePattern;

public class SafeSpaceCheck {
	
	private String[] stash;
	private int space = 5;
	private int count = 0;
	
	public SafeSpaceCheck() {
		stash = new String[5];
		
		stash[0] = "Yogurt";
		stash[1] = "Mouse";
		stash[2] = "My Soul";
		stash[3] = "";
		stash[4] = "";
		
		count = 3;
	}
	
	public int getItemCount() {
		return count;
	}
	
	public void getStash() {
		System.out.println("Current Stash:");
		for(int i = 0; i < stash.length; i++){
			if(stash[i] != "")
				System.out.println("\t" + (i + 1) + ": " + stash[i]);
		}
	}
	
	public void storeItem(String item, int index) {
		stash[index] = item;
		count++;
		System.out.println("Stored " + item + " in slot number " + (index + 1));
	}
	
	public void removeItem(String item) {
		if(getItemCount() > 0){
			boolean found = false;
			
			for(int i = 0; i < stash.length; i++){
				if(stash[i] == item){
					System.out.println("Removing " + item + " from slot " + (i + 1));
					stash[i] = "";
					count--;
					found = true;
					break;
				}
			}
			
			if(!found)
				System.out.println("Virtual Safe does not contain " + item);
		}
		else{
			System.out.println("Virtual Safe does not contain " + item);
		}
	}
	
	public boolean hasSpace(String item) {
		if(getItemCount() == space){
			System.out.println("Virtual Safe is full, time to clean the cache");
			System.out.println("Current Status: " + getItemCount() + " of " + space + " items");
			
			return false;
		}
		else{
			int index = 0;
			
			for(int i = 0; i < stash.length; i++){
				if(stash[i] == ""){
					index = i;
					break;
				}
			}
			
			storeItem(item, index);
			return true;
		}
	}
}
