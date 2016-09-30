package FacadePattern;

public class VirtualSafeFacade {
	
	private int serialId;
	private int pin;

	SerialIdCheck serialCheck;
	PinCheck pinCheck;
	SafeSpaceCheck spaceCheck;
	
	VSafeStart welcome;
	
	public VirtualSafeFacade(int serialId, int pin) {
		this.serialId = serialId;
		this.pin = pin;
		
		welcome = new VSafeStart();
		serialCheck = new SerialIdCheck();
		pinCheck = new PinCheck();
		spaceCheck = new SafeSpaceCheck();
	}
	
	public int getSerialId() {
		return serialId;
	}
	public int getPin() {
		return pin;
	}
	
	public void storeItem(String item) {
		if(serialCheck.isRegistered(serialId) && 
		   pinCheck.isPinValid(pin) && 
		   spaceCheck.hasSpace(item)){
			System.out.println("Done.");
		}
		else{
			System.out.println("Failed to store " + item);
		}
	}
	
	public void removeItem(String item) {
		if(serialCheck.isRegistered(serialId) &&
		   pinCheck.isPinValid(pin)){
			spaceCheck.removeItem(item);
			System.out.println("Done.");
		}
	}
	
	public void currentItems(){
		if(serialCheck.isRegistered(serialId) &&
		   pinCheck.isPinValid(pin))
			spaceCheck.getStash();
	}
	
}
