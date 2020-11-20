package tracciaDonatoLucente622810;

class CognomeNome {
	private String cognome;
	private String nome;
	
	CognomeNome(String cognome,String nome) {
		this.cognome = cognome;
		this.nome = nome;
	}
	String getNome() {
		return nome;
	}
	String getCognome() {
		return cognome;
	}
	
	public String toString() {
		return this.cognome + " " + this.nome;
	}
	
	public boolean equals(Object obj) {
		return (this.cognome.equals(((CognomeNome) obj).getCognome()) &&
				(this.nome.equals(((CognomeNome) obj).getNome())));	
	}
}
