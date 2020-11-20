package esempi;

public class Item {
	int id;
	String valore;
	
	Item (int id, String valore) {
		this.id = id;
		this.valore = valore;
	}
	
	public static void main(String[] args) {
		Item prova = new Item(1,"Ciao");
		System.out.println(prova);
	}
}
