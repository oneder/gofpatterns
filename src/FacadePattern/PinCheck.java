package FacadePattern;

public class PinCheck {
	
	private int pin = 0000;
	
	public int getPin() {
		return this.pin;
	}
	
	public boolean isPinValid(int pin) {
		if(this.pin == pin)
			return true;
		else
			return false;
	}
	
}
