package traccia191119TreeMapReduce;

class Scheda {
	private String titolo;
	private double prezzo;
	
	Scheda(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}
	String getTitolo() {
		return titolo;
	}
	double getPrezzo() {
		return prezzo;
	}
	
	public String toString() {
		return this.titolo + " " + this.prezzo;
	}
}
