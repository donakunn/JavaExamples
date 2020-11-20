package traccia191119TreeMapReduce;

class Codice implements Comparable<Codice>{
	private int id;
	
	Codice(int id) {
		this.id = id;
	}
	int getId() {
		return id;
	}

	public String toString() {
		return String.valueOf(id);
	}
	@Override
	public int compareTo(Codice c) {
		return (id < c.getId() ? -1 : (id == c.getId() ? 0 : 1));
	}
	
}
