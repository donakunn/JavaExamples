package traccia11062019TreeMapThreadFunz;

class Pagella {
	
	private String nomeCorsoDiLaurea;
	private int NEsamiSostenuti;
	
	Pagella(String nome, int esami) {
		this.nomeCorsoDiLaurea = nome;
		this.NEsamiSostenuti = esami;
	}
	
	public String toString() {
		return this.nomeCorsoDiLaurea + " " + this.NEsamiSostenuti;
	}
}
