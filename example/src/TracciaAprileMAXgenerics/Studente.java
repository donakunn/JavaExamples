package TracciaAprileMAXgenerics;

public class Studente implements Comparable<Studente>{
	private String matricola;
	private String nome;
	private int eta;
	
	Studente(String matricola,String nome, int eta) {
		this.matricola = matricola;
		this.nome = nome;
		this.eta = eta;
	}
	String getNome() {
		return this.nome;
	}
	int getEta() {
		return this.eta;
	}

	@Override
	public int compareTo(Studente s) {
		return this.nome.compareTo(s.getNome());
	}
	
	public String toString() {
		return this.matricola + " " + this.nome + " " + this.eta;
	}
	
	public static void main(String args[]) {
		Studente[] s = { new Studente("1234","ciccio",23), new Studente("gfrt","dom",19),
				new Studente("vbgh","asdo",47),new Studente("cvbn","xav",26),
				new Studente("zaxs","qwert",17),new Studente("4567","wert",30)
		};
		
		System.out.println("Studente con nome più alto: " + new Max().massimo(s));
		System.out.println("Studente con eta più alta: " + new Max().massimo(s, new ComparatorEta()));
	}
	
	
}
