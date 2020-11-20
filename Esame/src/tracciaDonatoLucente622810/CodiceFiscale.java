package tracciaDonatoLucente622810;

class CodiceFiscale {
	private String codF;
	
	CodiceFiscale(String codF) {
		this.codF = codF;
	}
	String getCF() {
		return this.codF;
	}
	
	public String toString() {
		return this.codF;
	}
	public boolean equals(Object obj) {
		return this.codF.equals(((CodiceFiscale) obj).getCF());	
	}
	
	public int hashCode() {
		return this.codF.hashCode();
	}
}
