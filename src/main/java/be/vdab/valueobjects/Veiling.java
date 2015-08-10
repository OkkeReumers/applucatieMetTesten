package be.vdab.valueobjects;

public class Veiling {
	private int hoogsteBod; // automatische default 0
	
	public void doeBod(int bedrag) {
		if (bedrag > hoogsteBod) {
			hoogsteBod = bedrag;
		}
	}
	public int getHoogsteBod() {
		return hoogsteBod;
	}

}
