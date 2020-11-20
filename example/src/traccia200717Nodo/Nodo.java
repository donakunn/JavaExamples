package traccia200717Nodo;

import java.io.*;
import java.util.*;

class Nodo implements Serializable 
{
	int id;
	
	Nodo(int i) {
		this.id = i;
	}

	int getId() {
		return this.id;
	}

}

class Grafo implements Serializable{
	static int generatoreCodice=0;
	transient String password;
	int codice= generatoreCodice++;
	HashMap<Nodo,Set<Nodo>> rete = new HashMap<Nodo,Set<Nodo>>();
	Grafo (String psw){
		password=psw;
	}
	void addNodo(Nodo c){
		// aggiunge nodo senza alcuna connessione ad altri nodi
	}
	void addNodo(Nodo c1, Nodo c2)
	{
		// aggiunge nodo c2 connettendo al nodo c1 nel grafo
	}

	void sort(Nodo c) {

		if (this.rete.containsKey(c)) {
			List<Nodo> list = new ArrayList<Nodo>(this.rete.get(c));
			java.util.Collections.sort(list,new Comparator<Nodo>() {
				public int compare(Nodo o1, Nodo o2) {
					return (o1.getId() < o2.getId() ? -1 : (o1.getId() == o2.getId() ? 0 : 1));
				}
			});
			Set<Nodo> set = new HashSet<Nodo>(list);
			this.rete.put(c,set);
		}
		
	}
	
	void serializza(Grafo g) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Grafo.dat"));
		out.writeObject(g);
		out.writeObject(Grafo.generatoreCodice);
		out.close();
		
	}
	
	static Grafo deserializza(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Grafo g = (Grafo) in.readObject();
		in.close();
		return g;
	}
	
	public static void main(String []Args) {
		Grafo g = new Grafo("1234");
		g.addNodo(new Nodo(2));
		g.addNodo(new Nodo(3),new Nodo(23));
		try {
			g.serializza(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Grafo h = deserializza("Grafo.dat");
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


}
