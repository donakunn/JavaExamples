package traccia050219SerHashMap;

class Eta implements Comparable<Eta>{
	private int eta;
	
	Eta(int i) {
		this.eta = i;
	}
	
	int getEta() {
		return this.eta;
	}
	
	public String toString() {
		return String.valueOf(this.eta); 
	}

	@Override
	public int compareTo(Eta e) {
		return (this.eta > e.getEta() ? -1 : ( this.eta == e.getEta() ? 0 : 1));
	}
}
