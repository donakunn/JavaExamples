package traccia151117HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Contenitore {
	
	HashSet<Item> set = new HashSet<>();
	
	public void fill() {
		set.add(new Item(23,"ciccio"));
		set.add(new Item(55,"pippo"));
		set.add(new Item(2,"topolino"));
		set.add(new Item(90,"paperino"));
		set.add(new Item(45,"dido"));
		
	}
	
	public void stampa() {
		System.out.println(this.set);
	}
	
	public Iterator<Item> getIterator() {
		Iterator<Item> it = this.set.iterator();
		return it;
	}
	public static Item ricerca(int id, Contenitore cont) throws Exception {
		Iterator<Item> it = cont.getIterator();
		while (it.hasNext()) {
			Item newIt = it.next();
			if (newIt.getId() == id) {
				return newIt;
			}
		}
		return null;
	}
	
	public static void main(String []args) {
		Contenitore cont = new Contenitore();
		cont.fill();
		System.out.println("Il contenuto del contenitore è il seguente: ");
		cont.stampa();
		System.out.println("Provo a cercare l'item il cui id è 45");
		try {
			Item item = ricerca(45, cont);
			System.out.println("L'item cercato è il seguente: " + item);
		} catch (Exception e) {
			System.err.println("Item not found");
		}
		
	}
}
