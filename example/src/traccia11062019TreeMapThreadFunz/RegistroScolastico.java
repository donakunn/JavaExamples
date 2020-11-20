package traccia11062019TreeMapThreadFunz;


import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java.util.*;

public class RegistroScolastico extends TreeMap<Studente,Pagella>{

	
	public void stampa() {
		System.out.println(this);
	}
	
	public Pagella ricerca(Studente s) {
		if (this.containsKey(s)) return this.get(s);
		else throw new IllegalArgumentException("Key not found");
	}
	
	public void RegistroScolasticoIntFunz(Predicate<Studente> pred, Consumer<Studente> cons) {
		Set<Studente> set = this.keySet();
		for (Studente s : set) {
			if (pred.test(s)) {
				cons.accept(s);
			}
		}
	}

	
	
	public static void main(String[] args) {
		RegistroScolastico r = new RegistroScolastico();
		Studente s = new Studente(2131,"pippoTopolino",1994);
		r.put(new Studente(3123,"ciccioCappuccio",1999), new Pagella("Informatica",12));
		r.put(s, new Pagella("Matematica",0));
		r.put(new Studente(8765,"sordFrat",2000), new Pagella("Merendine",4));
		r.put(new Studente(3424,"amechehosceltoInf",2001), new Pagella("Scienze",23));
		r.put(new Studente(4534,"nonpotevoandareazappare",1980), new Pagella("Vita",9));
		r.stampa();
		System.out.println("La pagella corrispondente a Topolino è: " + r.ricerca(s));
		r.RegistroScolasticoIntFunz(st -> st.getAnnoEta() > 1999, st -> st.setAnnoEta(st.getAnnoEta()+1));
		System.out.println("RegistroScolastico dopo lambda expression \n");
		r.stampa();
	}
}
