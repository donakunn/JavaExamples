package traccia131118SerComp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collezione implements Serializable{
	ArrayList<Studente> studenti;
	
	public Collezione() {
		this.studenti = new ArrayList<Studente>();
	}
	
	public void fill() {

		this.studenti.add(new Studente("Piermario",4,27));
		this.studenti.add(new Studente("Donato",23,22.1));
		this.studenti.add(new Studente("Donatello",25,18.8));
		this.studenti.add(new Studente("Lara",10,28.9));
	}
	
	public void stampa() {
		System.out.println(this.studenti);
	}
	
	public Studente max(Comparator<Studente> c) {
		Studente st = Collections.max(this.studenti,c);
		return st;
	
	}
	public void serializza() throws IOException {
		FileOutputStream outF = new FileOutputStream("Studenti.dat");
		ObjectOutputStream out = new ObjectOutputStream(outF);
		out.writeObject(this.studenti);
		out.close();
	}
	
	public static void main(String []args) {
		Collezione col = new Collezione();
		col.fill();
		col.stampa();
		System.out.println("Studente con media più alta: " + col.max(new CompByMedia()));
		System.out.println("Studente con più esami fatti: " + col.max(new CompByNEsami()));
		try { 
			col.serializza();
		} catch (IOException e) {
			
		}
		
	}
	
	
}
