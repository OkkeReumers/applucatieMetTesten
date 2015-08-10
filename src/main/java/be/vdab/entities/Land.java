package be.vdab.entities;

public class Land {
	private String landcode;
	private int oppervlakte; 

	public Land(String landcode, int oppervlakte) {
		this.landcode = landcode;
		this.oppervlakte = oppervlakte;
	}

	public String getLandcode() {
		return landcode;
	}

	public void setLandcode(String landcode) {
		this.landcode = landcode;
	}

	public int getOppervlakte() {
		return oppervlakte;
	}

	public void setOppervlakte(int oppervlakte) {
		this.oppervlakte = oppervlakte;
	}

}
