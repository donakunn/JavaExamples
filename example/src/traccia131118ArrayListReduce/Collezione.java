package traccia131118ArrayListReduce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Collezione extends ArrayList<Studente> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Studente max(Comparator c) {
		Studente s = this.get(0);
		for (Studente st : this) {
			if (c.compare(s, st) < 0) s = st;
		}
		return s;
		
	}
	
	public void serialize() throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Collezione.dat"));
		try {
		out.writeObject(this);
		}
		finally {
			out.close();
		}
	}
	
	public static Collezione deSerialize() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Collezione.dat"));
		try { 
			Collezione c = (Collezione) in.readObject();
			return c;
		}
		finally {
			in.close();
		}
	}
	
	Optional<Studente> pipelineReduce() {
		Optional<Studente> studente = this.stream().filter(s -> s.getGenere().equals("Femmina")).reduce((s,t)-> s.getNumeroEsami() > t.getNumeroEsami() ? s : t);
		return studente;
	}
	
	public static void main(String []args) {
		Collezione c = new Collezione();
		c.add(new Studente("Femmina",21,23.0));
		c.add(new Studente("Maschio",3,19.5));
		c.add(new Studente("Maschio",24,27.7));
		c.add(new Studente("Femmina",19,29.0));
		c.add(new Studente("Maschio",7,29.1));
		System.out.println("Lista studenti:" + c);
		System.out.println("Studente con media più alta: " + c.max(new ComparatorMedia()));
		System.out.println("Studente con numero esami più alto: " + c.max(new ComparatorNEsami()));
		System.out.println("Provo a serializzare la lista...");
		try {
			c.serialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Lista Serializzata.");
		System.out.println("Provo a deserializzare la lista...");
		Collezione c1 = new Collezione();
		try {
			c1 = Collezione.deSerialize();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("Contenuto lista deserializzata: " + c1);
		System.out.println("lo studente female con più esami è: " + c.pipelineReduce());
	}
}
