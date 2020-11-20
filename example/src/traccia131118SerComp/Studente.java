package traccia131118SerComp;

import java.io.Serializable;

class Studente implements Serializable{
	private transient String genere;
	private int numeroEsami;
	private double mediaVoti;
	
	Studente(String gen, int n, double mv) {
		this.genere= gen;
		this.numeroEsami= n;
		this.mediaVoti = mv;
	}
	
	 int getEsami() {
		 return this.numeroEsami;
	 }
	 
	 String getGenere() {
		 return this.genere;
	 }
	 
	 double getMedia() {
		 return this.mediaVoti;
	 }
	
	public String toString() {
		return (this.genere + " " + this.numeroEsami + " " + this.mediaVoti );
		
	}

	
}
