package be.vdab.util;

public class Woord {
	private final String woord;

	// geef aan de constructor een woord mee
	public Woord(String woord) {
		this.woord = woord;
	}

	// controleer of woord gelijk is aan het omgekeerde van woord
	public boolean isPalindroom() {
		String reverse = new StringBuffer(woord).reverse().toString();
		return woord.equals(reverse);
	}

}
