package traccia11062019TreeMapThreadFunz;

class Studente implements Comparable<Studente>{
	
	private int matricola;
	private String nomeCognome;
	private int annoDiNascita;
	
	Studente(int mat, String nomeCog, int anno) {
		this.matricola = mat;
		this.nomeCognome = nomeCog;
		this.annoDiNascita = anno;
	}
	
	public String toString() {
		return this.matricola + " " + this.nomeCognome + " " + this.annoDiNascita;
	}
	
	int getMatricola() {
		return this.matricola;
	}
	int getAnnoEta() {
		return this.annoDiNascita;
	}
	void setAnnoEta(int a) {
		this.annoDiNascita = a; 
	}
	
	
	public int compareTo(Studente o) {
		return (this.matricola < o.getMatricola() ? -1 : (this.matricola == o.getMatricola() ? 0 : 1));
		
	}
}
