package FacadePattern;

public class SerialIdCheck {
	
	private int serialId = 123456789;
	
	public int getSerialId() {
		return this.serialId;
	}
	
	public boolean isRegistered(int serialId) {
		if(this.serialId == serialId)
			return true;
		else
			return false;
	}
	
}
