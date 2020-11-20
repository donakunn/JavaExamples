package traccia26092016ArraySer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Esame1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient String aula; 	//attributi transient non vengono serializzati
	static Integer codiceGenerator=1; //occorre serializzarli esplicitamente
	private int codiceEsame=codiceGenerator++;
	private String nome;
	private int voto;
	
	Esame1(String aula, String nome, int voto) {
	this.aula=aula; this.nome=nome;this.voto=voto;
	}
	
	void salva() {
			try {
				FileOutputStream fileOut = new FileOutputStream("esame1.dat");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(this);
				out.writeObject(codiceGenerator);
				out.close();
				fileOut.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	static Esame1 carica() {
		Esame1 e = null;
		try {
			FileInputStream fileIn = new FileInputStream("esame1.dat");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Esame1) in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return e;
	}
	
	public String toString() {
		return this.aula + " " + codiceGenerator + " " + this.nome + " " + this.voto;
	}
	
	public static void main(String[]args) {
		Esame1 e = new Esame1("aula1","ciccio",23);
		e.salva();
		Esame1 e2 = Esame1.carica();
		System.out.println("La classe serializzata è: " + e2);
	}
}
