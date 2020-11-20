import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Treno implements Serializable{

	private HashMap<Posto,Prenotazione> map;

	public void Prenota(Posto p, Prenotazione pre) throws RuntimeException {
		if (this.map.containsKey(p)) throw new RuntimeException(p + " Non presente");
		else this.map.put(p,pre);
	}

	public Treno() {
		this.map  = new HashMap<Posto, Prenotazione>();
	}

	public Prenotazione leggiPrenotazione(Posto p) {
		if (!this.map.containsKey(p)) throw new RuntimeException(p + " Non presente");
		Prenotazione pr = this.map.get(p);

		return pr;
	}

	public boolean uguale (Treno t1, Treno t2) {
		return t1.equals(t2);
	}

	public void Serializza(Treno t) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Treno.dat"));
		out.writeObject(t);
		out.close();
	}
	public Treno Deserializza(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Treno t = (Treno)in.readObject();
		in.close();
		return t;
	}
}
