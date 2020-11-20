import java.io.Serializable;

class Posto implements Serializable{
	private int codicePosto;
	private String categoria;
	
	public Posto(int cod, String cat) {
		this.codicePosto= cod;
		this.categoria = cat;
	}
	
	public String toString() {
		return this.codicePosto + " " + this.categoria;
	}
	
	public int hashCode() {
		return ((Integer)this.codicePosto).hashCode();
	}
}

