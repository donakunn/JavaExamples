package traccia050717Sort;


class Studente implements Comparable<Studente>
{
	private int matricola;
	private String nome;
	private String cognome;
	
	Studente(int mat, String nome, String cognome) {
		this.matricola = mat;
		this.nome = nome;
		this.cognome = cognome;
	}
	int getMat() {
		return this.matricola;
	}
	
	public String toString() {
		return nome + " " + cognome + " " + matricola;
	}

	

	public int compareTo(Studente o) {
		int i = o.getMat();
		return (i < this.matricola ? 1 : (o.getMat() == this.matricola ? 0 : -1));
	}

	
}
