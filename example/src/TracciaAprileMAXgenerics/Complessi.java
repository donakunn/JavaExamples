package TracciaAprileMAXgenerics;

import java.util.LinkedList;
import java.util.List;

public class Complessi {
	private double real;
	private double imm;
	
	public Complessi(double real,double imm) {
		this.real = real;
		this.imm = imm;
	}
	
	public String toString() {
		return real + "/" + imm;
	}
	
	public static void main(String args[]) {
		
		List<Complessi> complessi = new LinkedList<Complessi>();
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		complessi.add(new Complessi(Math.random()*10,Math.random()));
		List complessiSenzaGen = new LinkedList();
		complessiSenzaGen.add(new Complessi(Math.random()*10,Math.random()));
		complessiSenzaGen.add(new Complessi(Math.random()*10,Math.random()));
		complessiSenzaGen.add(new Complessi(Math.random()*10,Math.random()));
		complessiSenzaGen.add(new Complessi(Math.random()*10,Math.random()));
		complessiSenzaGen.add(new Complessi(Math.random()*10,Math.random()));
		complessiSenzaGen.add(new Integer((int)Math.random()));
		
		System.out.println("Stampa lista usando ComplessiPrint senza Gen");
		new ComplessiPrint().print(complessiSenzaGen);
		System.out.println("Stampa lista usando ComplessiPrint con Gen");
		new ComplessiPrint().printComp(complessi);
		
	}
}
