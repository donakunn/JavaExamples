package traccia150615RunHashMap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

class Libretto extends HashMap<Esame,Voto> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Libretto() {
	}
	
	void verbalizza(Esame e, Voto v) {
		this.put(e,v);
	}
	
	Voto leggiVoto(Esame e) {
		if (this.containsKey(e)) {
			return this.get(e);
		}
		else return null;
		
	}
	
	boolean uguale(Libretto l) {
		return this.equals(l);
	}
	
	void serializza() {
		try {
			FileOutputStream fileOut = new FileOutputStream("libretto.dat");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(this);
	         out.close();
        	 fileOut.close();
        	 System.out.println("Oggetto serializzato");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	Libretto deserializza() {
		FileInputStream fileIn;
		Libretto l= new Libretto();
		try {
			fileIn = new FileInputStream("libretto.dat");
			ObjectInputStream in = new ObjectInputStream(fileIn);
	         l =(Libretto)in.readObject();
	         in.close();
	    	 fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	 return l;
		
	}
	
	public static void main(String[] args) {
		Libretto l = new Libretto();
		l.verbalizza(new Esame("Analisi"), new Voto(22));
		l.verbalizza(new Esame("Calcolo"), new Voto(25));
		l.verbalizza(new Esame("Map"), new Voto(27));
		l.verbalizza(new Esame("Fisica"), new Voto(18));
		System.out.println("Esami l verbalizzati con voto:" + l);
		System.out.println("Il voto associato a Map è " + l.leggiVoto(new Esame("Map")));
		Libretto l1 = new Libretto();
		l1.verbalizza(new Esame("Analisi"), new Voto(22));
		l1.verbalizza(new Esame("Calcolo"), new Voto(25));
		l1.verbalizza(new Esame("Map"), new Voto(27));
		l1.verbalizza(new Esame("Fisica"), new Voto(18));
		System.out.println("Esami l1 verbalizzati con voto:" + l);		
		System.out.println("Confronto tra esami: " + l.equals(l1));
		System.out.println("Serializzo libretto l");
		l.serializza();
		System.out.println("leggo libretto l da file");
		Libretto l2 = new Libretto().deserializza();
		System.out.println("contenuto l2" + l2);
		
	}

}
