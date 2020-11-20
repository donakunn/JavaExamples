package traccia050219SerHashMap;


import java.util.*;
import java.util.function.Predicate;


public class Anagrafe {
	
	private HashMap<CodiceFiscale,Tupla> anagrafe = new HashMap<CodiceFiscale,Tupla>();
	
	private class Tupla {
		private Nome nome;
		private Cognome cognome;
		private Eta eta;
		
		private Tupla(Nome n, Cognome c, Eta e) {
			this.nome = n;
			this.cognome = c;
			this.eta = e;
		}
		Eta leggiEta() {
			return this.eta;
		}
		
		Nome getNome() {
			return this.nome;
		}
		
		Cognome getCognome() {
			return this.cognome;
		}
		
		public String toString() {
			return this.nome + " " + this.cognome + " " + this.eta;
		}
	}
	
	public void aggiungi(CodiceFiscale cf,Nome n, Cognome c, Eta e) {
		Tupla t = new Tupla(n,c,e);
		anagrafe.put(cf,t);
	}
	public void cancella(Eta e) {
		LinkedList<CodiceFiscale> keyList = new LinkedList<CodiceFiscale>(this.anagrafe.keySet());
		for (CodiceFiscale cf : keyList) {
			if ((anagrafe.get(cf).leggiEta().compareTo(e)) < 0) {
				anagrafe.remove(cf);
			}
		}
		
	}
	public int conta(Nome n, Cognome c, Predicate<Tupla> pred) {
		int counter = 0;
		for (Tupla t: this.anagrafe.values()) {
			if (pred.test(t)) {
				counter++;
			}
		}
		return counter;
	}
	
	public void assegna(CodiceFiscale cf, CodiceFiscale cf1) throws ClassNotFoundException {
		if (this.anagrafe.containsKey(cf1)) {
			if (this.anagrafe.containsKey(cf)) {
				this.anagrafe.put(cf, this.anagrafe.get(cf1));
			} else throw new ClassNotFoundException();
		} else throw new ClassNotFoundException();
	}
	
	public CodiceFiscale max(){
		LinkedList<CodiceFiscale> keyList = new LinkedList<CodiceFiscale>(this.anagrafe.keySet());
		Iterator<CodiceFiscale> it = keyList.iterator();
		CodiceFiscale maxCF = it.next();
		while (it.hasNext()) {
			CodiceFiscale cfTotTest = it.next();
			if ((anagrafe.get(cfTotTest).leggiEta().compareTo(this.anagrafe.get(maxCF).leggiEta())) < 0) {
				maxCF = cfTotTest;
			}
		}
		
		return maxCF;
	}
	
	
	public HashMap<CodiceFiscale,Tupla> getMap() {
		return this.anagrafe;
	}
	
	public void orderedMap() {
		System.out.println("Map ordinato: " + new TreeMap<CodiceFiscale,Tupla>(anagrafe));
	}

	public static void main(String[] args) {
		Anagrafe anagrafe = new Anagrafe();
		anagrafe.aggiungi(new CodiceFiscale("aaaa"), new Nome("Ciccio"), new Cognome("dsgbhb"), new Eta(24));
		anagrafe.aggiungi(new CodiceFiscale("bbbb"), new Nome("dasdsa"), new Cognome("rrrrrr"), new Eta(3));
		anagrafe.aggiungi(new CodiceFiscale("cccc"), new Nome("hnnhg"), new Cognome("ggggggg"), new Eta(33));
		anagrafe.aggiungi(new CodiceFiscale("dddd"), new Nome("Devis"), new Cognome("Ucarlo"), new Eta(49));
		anagrafe.aggiungi(new CodiceFiscale("dddd"), new Nome("Devis"), new Cognome("Ucarlo"), new Eta(23));
		anagrafe.aggiungi(new CodiceFiscale("dddd"), new Nome("Devis"), new Cognome("Ucarlo"), new Eta(43));
		anagrafe.aggiungi(new CodiceFiscale("eeee"), new Nome("nbvv"), new Cognome("jnbgv"), new Eta(65));
		anagrafe.aggiungi(new CodiceFiscale("ffff"), new Nome("ffrrh"), new Cognome("ttyy"), new Eta(74));
		System.out.println("Anagrafe prima di cancella: \n" + anagrafe.getMap());
		anagrafe.cancella(new Eta(50));
		System.out.println("Anagrafe dopo di cancella: \n" + anagrafe.getMap());
		System.out.println("Numero persone con nome e cognome uguale a Devis Ucarlo : " + anagrafe.conta(new Nome("Devis"), new Cognome("Ucarlo"),
				t -> t.getCognome().equals(new Cognome("Ucarlo"))&&t.getNome().equals(new Nome("Devis"))));
		anagrafe.orderedMap();
	}

}
