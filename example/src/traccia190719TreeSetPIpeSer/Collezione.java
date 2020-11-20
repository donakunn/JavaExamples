package traccia190719TreeSetPIpeSer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Collezione implements Serializable{
	private Set<Studente> collezione;
	
	public Collezione() {
		this.collezione = new HashSet<Studente>();
	}
	
	public void stampaCollezione() {
		System.out.println("Set prima dell'ordinamento: \n" + collezione);
		LinkedList<Studente> lista = new LinkedList<Studente>(this.collezione);
		Collections.sort(lista);
		System.out.println(lista);
	}
	
	void aggiungi(Studente s) {
		collezione.add(s);
	}
	int sommaEta() { 
		return collezione.stream().filter(s -> s.getEta() < 21).mapToInt(s -> s.getEta()).reduce(0,(a,b) -> a + b);
	}
	
	public void salva() throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coll.dat"));
		try { 
			out.writeObject(this);
		} finally {
			out.close();
		}
	}
	
	public static Collezione carica() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("coll.dat"));
		try { 
			return (Collezione)in.readObject();
			} finally {
			in.close();
		}
	}
	
	public static void main(String args[]) {
		Collezione c = new Collezione();
		c.aggiungi(new Studente("1234", 22,18));
		c.aggiungi(new Studente("dsaa", 12,45));
		c.aggiungi(new Studente("awry", 17,26));
		c.aggiungi(new Studente("1234", 3,19));
		c.aggiungi(new Studente("bvcv", 1,17));
		c.aggiungi(new Studente("fghj", 15,19));
		c.aggiungi(new Studente("tyui", 24,27));
		c.aggiungi(new Studente("2344", 24,28));
		c.stampaCollezione();
		System.out.println("Somma delle eta: " + c.sommaEta());
			try {
				c.salva();
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("contenitore deserializzato: " );
		try {
			Collezione.carica().stampaCollezione();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
