package traccia191119TreeMapReduce;

import java.util.*;
import java.util.function.*;

public class Schedario extends TreeMap<Codice,Scheda>{
	
	public void stampaSchedario() {
		System.out.println("Contenuto Schedario: " + this);
	}
	
	double sommaPrezziMAPPrefisso() {
		return this.values().stream()
				.filter(s -> s.getTitolo().substring(0,3).equals("map"))
				.mapToDouble(s -> s.getPrezzo())
				.reduce(0,(a,b) -> a + b);
	}
	
	double sommaFunz(Predicate<Scheda> pred,Function<Scheda,Double> map) {
		double somma = 0;
		for (Scheda s : this.values()) {
			if (pred.test(s)) {
				double prezzo = map.apply(s);
				somma +=prezzo;
			}
		}
		return somma;
		
	}
	public static void main(String[] args) {
		Schedario s = new Schedario();
		s.put(new Codice(4433), new Scheda("ciccio",23.4));
		s.put(new Codice(1234), new Scheda("mapssss",19));
		s.put(new Codice(8767), new Scheda("mapdsdssd",21.5));
		s.put(new Codice(1290), new Scheda("bvvc",5.04));
		s.put(new Codice(9212), new Scheda("mapxcxc",13.5));
		s.put(new Codice(9384), new Scheda("asdf",54.5));
		s.stampaSchedario();
		System.out.println("Somma dei prezzi dei libri che cominciano con 'map': " 
				+ s.sommaPrezziMAPPrefisso());
		System.out.println("Somma dei prezzi dei libri che cominciano con 'map': " 
				+ s.sommaFunz(st -> st.getTitolo().substring(0,3).toLowerCase().equals("map"),
						st -> st.getPrezzo()));
	}

}
