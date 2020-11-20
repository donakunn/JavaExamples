import java.io.Serializable;

class Prenotazione implements Serializable{
	
	private String codFiscale;
	private String nome;
	private String cognome;
	private int Prezzo;
	
	Prenotazione(String cod,String n,String cog,int pr) {
		this.codFiscale = cod;
		this.nome = n;
		this.cognome = cog;
		this.Prezzo = pr;
	}
	
	public String toString() {
		return this.codFiscale + " " + this.nome + " " + this.cognome + " " + this.Prezzo;
	}
}
