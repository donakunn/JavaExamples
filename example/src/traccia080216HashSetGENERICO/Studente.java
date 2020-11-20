package traccia080216HashSetGENERICO;

class Studente {
	private int matricola;
	private String nome;
	private	String cognome;
	
	Studente(int mat, String n, String cog) {
		this.matricola = mat;
		this.nome = n;
		this.cognome = cog;
	}
	
	public String toString() {
		return this.matricola + " " + this.nome + " " + this.cognome;
	}
	
	public boolean equals(Object obj) {
		Studente s = (Studente)obj;
		return this.matricola == s.matricola && this.nome.equals(s.nome) && this.cognome.equals(s.cognome);
	}
	
	public int hashCode() {
		return Integer.valueOf(matricola).hashCode();
	}
}
