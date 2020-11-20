package traccia190719TreeSetPIpeSer;

import java.io.Serializable;

class Studente implements Comparable<Studente>,Serializable{

	private String matricola;
	private int numeroEsami;
	private int eta;

	Studente(String matricola, int numeroEsami, int eta) {
		this.matricola = matricola;
		this.numeroEsami = numeroEsami;
		this.eta = eta;
	}

	public String toString() {
		return matricola + " " + numeroEsami;
	}

	int getEsami() {
		return numeroEsami;
	}
	int getEta() {
		return eta;
	}
	String getMatricola() {
		return matricola;
	}

	public int hashCode() {
		return this.matricola.hashCode();
	}
	public boolean equals(Object obj) {
		return this.matricola.equals(((Studente)obj).getMatricola());
	}
	@Override
	public int compareTo(Studente o) {
		return (this.numeroEsami < o.getEsami() ? -1 : (this.numeroEsami == o.getEsami() ? 0 : 1));
	}	

}
