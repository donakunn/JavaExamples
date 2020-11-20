package traccia050219SerHashMap;

class Cognome {
private String cognome;
	
	Cognome(String n) {
		this.cognome= n;
	}
	
	public String toString() {
		return this.cognome;
	}
	public String getCognome() {
		return this.cognome;
	}
	
	public boolean equals(Object obj) {
		return this.cognome.equals(((Cognome) obj).getCognome());
	}
}
