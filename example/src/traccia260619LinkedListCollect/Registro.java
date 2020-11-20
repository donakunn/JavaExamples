package traccia260619LinkedListCollect;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;


public class Registro extends LinkedList<Studente> implements IntConsumer{
	private int totale;
	private int contatore;
	
	public void accept(int i) { totale+=i; contatore++; }
	public double average() { return contatore > 0 ? (double)totale/contatore : 0; } 
	public void combine(Registro altro) {
		totale += altro.totale;
		contatore += altro.contatore;
	}
	public int mediaEtaPipelineAverage(){
		return (int)this.stream().filter(s ->s.getEsami()>3)
				.mapToInt(s->s.getEta()).average().getAsDouble();
		
	}
	public int mediaEtaPipelineCollect() {
		return (int)this.parallelStream().filter(s -> s.getEsami() >3).map(s-> s.getEta())
				.collect(Registro::new,Registro::accept,Registro::combine).average();
		
	}
	public Map<Integer,List<Studente>> groupByEtaExample(){
		return this.stream().collect(Collectors.groupingBy(Studente::getEta));
	}
	
	public static void main(String[] args) {
		Registro r = new Registro();
		r.add(new Studente("abcd",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("sasda",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("abfdgcd",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("jabcd",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("hgfd",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("tyui",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("123e",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("543f",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		r.add(new Studente("5433",(int)(Math.random()*41)+19,(int)(Math.random()*15)));
		System.out.println("Lista di studenti: " + r);
		System.out.println("Eta media usando Average: " + r.mediaEtaPipelineAverage());
		System.out.println("Eta media usando collect: " + r.mediaEtaPipelineCollect());
		System.out.println("Map studenti raggruppati per eta: " + r.groupByEtaExample());
		
		
	}
}
