package tracciaDonatoLucente622810;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Registro extends HashMap<CodiceFiscale,CognomeNome>{
	
	public void registra(CodiceFiscale cf, CognomeNome c) {
		this.put(cf, c);
	}
	CognomeNome leggiData(CodiceFiscale cf) {
		if (this.containsKey(cf)) {
			return this.get(cf);
		}
		else throw new IllegalArgumentException("Valore non contenuto");
	}
	
	List<CodiceFiscale> lista(CognomeNome c) {
		LinkedList<CodiceFiscale> lista = new LinkedList<CodiceFiscale>();
		for (CodiceFiscale o : this.keySet()) {
		      if (this.get(o).equals(c)) {
		        lista.add(o);
		      }
		}
		return lista;
	}
	
	public void rimpiazza(CodiceFiscale cf1, CodiceFiscale cf2) {
		if (this.containsKey(cf1)) {
			this.put(cf2, this.get(cf2));
		}
	}
	
	public static boolean uguale(Registro r1, Registro r2) {
		return r1.equals(r2);
	}

	public static void main(String[] args) {
		Registro r = new Registro();
		r.registra(new CodiceFiscale("abcd"), new CognomeNome("prova","test"));
		r.registra(new CodiceFiscale("dfgf"), new CognomeNome("Rossi","Nicola"));
		r.registra(new CodiceFiscale("cvbn"), new CognomeNome("Verdi","Martio"));
		r.registra(new CodiceFiscale("cvbn"), new CognomeNome("Disney","Topolino"));
		System.out.print("Registro 1: " +r);
		Registro r2 = new Registro();
		r2.registra(new CodiceFiscale("abcd"), new CognomeNome("prova","test"));
		r2.registra(new CodiceFiscale("dfgf"), new CognomeNome("Rossi","Nicola"));
		r2.registra(new CodiceFiscale("cvbn"), new CognomeNome("Verdi","Martio"));
		r2.registra(new CodiceFiscale("cvbn"), new CognomeNome("Disney","Topolino"));
		System.out.print("Registro 2: " +r);
		System.out.println("CognomeNome relativo a codfiscale abcd: " + r.leggiData(new CodiceFiscale("abcd")));
		System.out.println("Lista corrispondente a Rossi Nicola: " + r.lista(new CognomeNome("Rossi","Nicola")));
		
		r.rimpiazza(new CodiceFiscale("dfgf"), new CodiceFiscale("abcd"));
		System.out.print("Registro 1 dopo rimpiazza: " +r);
		System.out.println("Check se registri sono uguali: " + uguale(r,r2));
	}

}
