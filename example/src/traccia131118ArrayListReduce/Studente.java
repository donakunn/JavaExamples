package traccia131118ArrayListReduce;

import java.io.Serializable;

class Studente  implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient String genere;
	private int numeroEsami;
	private double mediaVoto;
	
	Studente(String s, int n, double m) {
		this.genere = s;
		this.numeroEsami = n;
		this.mediaVoto= m;
	}
	
	String getGenere() {
		return this.genere;
	}
	double getMediaVoti() {
		return this.mediaVoto;
	}
	int getNumeroEsami() {
		return this.numeroEsami;
	}
	
	public String toString() {
		return this.genere + " " + this.numeroEsami + " " + this.mediaVoto;
	}
}
