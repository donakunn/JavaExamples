package traccia260619LinkedListCollect;

class Studente {
	private String matricola;
	private int eta;
	private int numeroEsami;
	
	Studente(String mat, int eta, int nEsami){
		this.matricola= mat;
		this.eta = eta;
		this.numeroEsami = nEsami;
	}
	
	public String toString() {
		return this.matricola + " " + this.eta + " " + this.numeroEsami;
	}
	
	int getEsami() {
		return numeroEsami;
	}
	
	int getEta() {
		return eta;
	}
}
