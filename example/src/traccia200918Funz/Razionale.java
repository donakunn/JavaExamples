package traccia200918Funz;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Razionale {
	private int numeratore;
	private int denominatore;
	List<Razionale> lista = new LinkedList<Razionale>();
	public Razionale(int num, int den) {
		numeratore = num;
		denominatore = den;
	}

	public static void numPari(List<Razionale> list,Predicate<Razionale> pred, Consumer<Razionale> con) {
		for (Razionale r : list) {
			if (pred.test(r)) {
				con.accept(r);
			}
		}
	}
	public static void numPariPipeline(List<Razionale> list,Predicate<Razionale> pred, Consumer<Razionale> con) {
		
	}
	
	
	int getNum() {
		return numeratore;
	}

	
	public String toString() {
		return this.numeratore +"/" + this.denominatore;
	}
	
	public static void main(String args[]) {
		List<Razionale> lista = new LinkedList<Razionale>();
		lista.add(new Razionale(3,3));
		lista.add(new Razionale(5,44));
		lista.add(new Razionale(8,45));
		lista.add(new Razionale(12,65));
		lista.add(new Razionale(23,67));
		lista.add(new Razionale(2,5));
		System.out.println("Contenuto lista: " + lista);
		System.out.println("Numeri razionali con numeratore divisibile per 2: ");
		numPari(lista,r -> r.getNum()%2 == 0, r -> System.out.println(r));
		
		
	}

	
}
