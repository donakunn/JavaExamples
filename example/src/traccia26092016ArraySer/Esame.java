package traccia26092016ArraySer;

public class Esame implements Comparable<Esame>{
	
	private String codice;
	private String nome;
	private int crediti;
	private int voto;
	
	Esame(String cod, String nome, int crediti, int voto) {
		this.codice = cod;
		this.nome = nome;
		this.crediti = crediti;
		this.voto = voto;
	}
	public Esame() {
	}
	
	int getVoto() {
		return this.voto;
	}
	int getCrediti() {
		return this.crediti;
	}
	
	@Override
	public int compareTo(Esame esame) {
		return (crediti < esame.getCrediti() ? -1 : (crediti == esame.getCrediti() ? 0 : 1));
	}
	
	public String toString() {
		return "cod: " + this.codice + " esame: " + this.nome + " crediti: " + this.crediti + " voto: " + this.voto;
	}
	
	public static void main(String[]args) {
		Esame e[] = {new Esame("sdad","map",12,26), new Esame("saas","ing",9,24), new Esame("aaaa","calc",6,27)};
		System.out.println("l'esame da meno crediti è " + (new Min().minimo(e)));
		System.out.println("l'esame con voto più basso è " + (new Min().minimo(e,new EsameComparator())));
	}
}
