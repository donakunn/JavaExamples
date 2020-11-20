package traccia050219SerHashMap;

class Nome {
private String nome;
	
	Nome(String n) {
		this.nome= n;
	}
	
	public String toString() {
		return this.nome;
	}
	
	String getNome() {
		return this.nome;
	}
	public boolean equals(Object obj) {
		return this.nome.equals(((Nome) obj).getNome());
	}
}
