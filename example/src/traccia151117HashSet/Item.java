package traccia151117HashSet;

class Item  {
	private int id;
	private String valore;
	
	Item(int id, String val) {
		this.id = id;
		this.valore = val;
	}
	
	int getId() {
		return this.id;
	}
	
	boolean equals(Item i) {
		return (this.id == i.getId() ? true : false);
	}
	
	public String toString() {
		return id + " "+ valore;
	}
	
	public int hashCode() {
		return ((Integer)(this.id)).hashCode();
	}
	
	
	
}
