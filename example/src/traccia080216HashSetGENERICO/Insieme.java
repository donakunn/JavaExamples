package traccia080216HashSetGENERICO;

import java.util.HashSet;

public class Insieme<Elemento> {
	
	private HashSet<Elemento> insieme;
	
	Insieme(){
		this.insieme = new HashSet<Elemento>();
	}
	
	public void aggiungiElemento(Elemento e) {
		insieme.add(e);
	}
	
	public static boolean uguale(Insieme i, Insieme i2) {
		return i.equals(i2);
	}

	public static void main(String[] args) {
		Insieme<Integer> interi = new Insieme<Integer>();
		Insieme<Integer> interi2 = new Insieme<Integer>();
		Insieme<String> stringhe = new Insieme<String>();
		Insieme<String> stringhe2 = new Insieme<String>();
		Insieme<Studente> studenti = new Insieme<Studente>();
		Insieme<Studente> studenti2= new Insieme<Studente>();
		interi.aggiungiElemento(2);
		interi.aggiungiElemento(3);
		interi.aggiungiElemento(56);
		interi.aggiungiElemento(77);
		interi.aggiungiElemento(22);
		interi2.aggiungiElemento(2);
		interi2.aggiungiElemento(3);
		interi2.aggiungiElemento(56);
		interi2.aggiungiElemento(77);
		interi2.aggiungiElemento(22);
		System.out.println(interi + "\n" + interi2);
		if (uguale(interi,interi2)) {
			System.out.println("insiemi di interi sono uguali");
		}
		else System.out.println("insiemi di interi sono diversi");
		stringhe.aggiungiElemento("ciccio");
		stringhe.aggiungiElemento("cappuccio");
		
		stringhe2.aggiungiElemento("ciccio");
		stringhe2.aggiungiElemento("cappuccio");
	
		System.out.println(stringhe + "\n" + stringhe2);
		if (uguale(stringhe,stringhe2)) {
			System.out.println("insiemi di stringhe sono uguali");
		}
		else System.out.println("insiemi di stringhe sono diversi");
		studenti.aggiungiElemento(new Studente(2345,"Ciccio","Cappuccio"));
		studenti.aggiungiElemento(new Studente(3456,"Devis","Ucarlo"));
		studenti.aggiungiElemento(new Studente(2345,"Ciccio","Cappuccio"));
		studenti.aggiungiElemento(new Studente(4433,"Ciccio","Cappuccio"));
		
		studenti2.aggiungiElemento(new Studente(2345,"Ciccio","Cappuccio"));
		studenti2.aggiungiElemento(new Studente(3456,"Devis","Ucarlo"));
		studenti2.aggiungiElemento(new Studente(2345,"Ciccio","Cappuccio"));
		studenti2.aggiungiElemento(new Studente(4433,"Ciccio","Cappuccio"));
	
		System.out.println(studenti + "\n" + studenti2);
		if (uguale(studenti,studenti2)) {
			System.out.println("insiemi di studenti sono uguali");
		}
		else System.out.println("insiemi di studenti sono diversi");
	}
	
	public String toString() {
		return this.insieme.toString();
	}
	
	public boolean equals(Object obj) {
		Insieme<Elemento> ins = (Insieme<Elemento>)obj;
		return this.insieme.equals(ins.insieme);
	}

}
