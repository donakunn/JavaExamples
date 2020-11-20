package traccia050219SerHashMap;

class CodiceFiscale implements Comparable<CodiceFiscale> {
	private String codF;
	
	CodiceFiscale(String c) {
		this.codF = c;
	}
	
	public String toString() {
		return this.codF;
	}
	String getCf() {
		return this.codF;
	}

	@Override
	public int compareTo(CodiceFiscale cf) {
		return this.codF.compareTo(cf.getCf());
	}
	
	
}
